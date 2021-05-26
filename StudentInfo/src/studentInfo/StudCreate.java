/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.util.Scanner;
import studentBo.StudentBo;

/**
 *
 * @author lenovo
 */
public class StudCreate {
     String name;   
     String gender;
     String dob;
     int age;
     String address;
     String mobileNo;
     StudentBo StudCreate(){
         Scanner in=new Scanner(System.in);
         System.out.println("Enter Your Name");
         name=in.next();
         System.out.println("Enter Your Gender");
         gender=in.next();
         System.out.println("Enter Your Date Of Birth");
         dob=in.next();
         System.out.println("Enter Your Age");
         age=in.nextInt();
         System.out.println("Enter Your Address");
         address=in.next();
         System.out.println("Enter Your Mobile Number");
         mobileNo=in.next();
         
         
         StudentBo student=new StudentBo(name,gender,dob,age,address,mobileNo);
         return student;
     }
}
