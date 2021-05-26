/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.util.Scanner;
import studentBo.CertificateBo;

/**
 *
 * @author lenovo
 */
public class CertificateCreate {
    String activity;
    String nameofCertificate;
    String dateofCertificate;
    String organizer;
    String desc;
    
    CertificateBo CertificateCreate(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter activity");
        activity=in.next();
        System.out.println("Enter name of activity");
        nameofCertificate=in.next();
        System.out.println("Enter Date of activity");
        dateofCertificate=in.next();
        System.out.println("Oraganizer of activity");
        organizer=in.next();
        System.out.println("Description of activity ");
        desc=in.next();
        
             
        CertificateBo certificate=new CertificateBo(activity,nameofCertificate,dateofCertificate,organizer,desc);
         return certificate;
    }
}
