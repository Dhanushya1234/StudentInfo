/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.util.Scanner;
import studentBo.ExtraCurricularBo;

/**
 *
 * @author lenovo
 */
public class ExtraCurricularCreate {
    String activityType;
    String activity;
    String nameofCertificate;
    String dateofCertificate;
    String oraganizer;
    String desc;
    ExtraCurricularBo ExtraCurricularCreate(){
         Scanner in=new Scanner(System.in);
         System.out.println("Enter your extra curricular activity type");
         activityType=in.next();
         System.out.println("Enter your extra curricular activies");
         activity=in.next();
         System.out.println("Enter your name of extra curricular certficate");
         nameofCertificate=in.next();
         System.out.println("Enter date of extra curricular certificate");
         dateofCertificate=in.next();
         System.out.println("Enter Organizer of extra curricular certificate");
         oraganizer=in.next();
         System.out.println("Tell some description about certificates");
         desc=in.next();                   
         
         
         
         ExtraCurricularBo extra=new ExtraCurricularBo(activityType,activity,nameofCertificate,dateofCertificate,oraganizer,desc);
         return extra;
     }
}
