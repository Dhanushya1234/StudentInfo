/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;
import java.util.Scanner;
public class UserCreate {
    String name;
    String password;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter user name");
    name=in.nextLine();
    System.out.println("Enter your password");
    password =in.next();   
    
}
