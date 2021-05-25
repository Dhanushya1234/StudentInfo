/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class StudentInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserCreate obj=new UserCreate();
    String name;
    String password;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter user name");
    name=in.next();
    System.out.println("Enter your password");
    password =in.next(); 
    if(obj.checkuser(name))
    {
        if(obj.checkpass(password))
        { 
            System.out.println("WELCOME");
        }
        else{
                System.out.println("Enter valid password");
            }
    }
    else
    {
     System.out.println("Enter Valid User Name");
    }
 }
    
}
