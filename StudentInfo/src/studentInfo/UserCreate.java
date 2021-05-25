/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.util.Scanner;
import studentBo.UserBo;

public class UserCreate { 
    String name="dhanu";
    String password="xyz";
    
    UserBo createUser(int i){
    String name;
    String password;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter user name");
    name=in.next();
    System.out.println("Enter your password");
    password =in.next(); 
    
    UserBo user=new UserBo(i,name,password);
    return user;
    }
    boolean checkuser(String _name){
        return name.equals(_name);
    }
    boolean checkpass(String _password){
        return password.equals(_password);    
    }

}
