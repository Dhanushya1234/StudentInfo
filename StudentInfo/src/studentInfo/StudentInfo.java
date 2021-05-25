/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
        UserCreate obj=new UserCreate();
        for(int i=0;i<3;i++){ 
        UserBo user= obj.createUser(i+1);
        System.out.println(" My user name is:"+user.getUserName()+ " User id is:"+user.getUserId() +" And my password is:"+user.getUserPassword());
        users.add(user);
        }
 }
    
}
