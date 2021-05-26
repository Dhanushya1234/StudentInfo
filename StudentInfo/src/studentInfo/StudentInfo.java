/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import studentBo.StudentBo;
import studentBo.UserBo;
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
        ArrayList<UserBo> users=new ArrayList<UserBo>();
        ArrayList<StudentBo> student=new ArrayList<StudentBo>();
        UserCreate obj=new UserCreate();
        StudCreate obj1=new StudCreate();
        for(int i=0;i<3;i++){ 
        UserBo user= obj.createUser(i+1);
        System.out.println(" My user name is:"+user.getUserName()+ " User id is:"+user.getUserId() +" And my password is:"+user.getUserPassword());
        StudentBo stud=obj1.StudCreate();
        System.out.println("Name:"+stud.getName());
        System.out.println("Gender:"+stud.getGender());
        System.out.println("DOB:"+stud.getDob());
        System.out.println("Age:"+stud.getAge());
        System.out.println("Address:"+stud.getAddress());
        System.out.println("Mobile number:"+stud.getMobileNo());
        users.add(user);
        student.add(stud);
        }
        
        
        
        
 }
    
}
