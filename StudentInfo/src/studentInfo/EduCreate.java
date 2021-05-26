/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import studentBo.EducationBo;
import java.util.*;
public class EduCreate {
    String education;
    String institution;
    String specification;
    String afflicated;
    String startDate;
    String endDate;
    
    EducationBo EduCreate(){
          Scanner in =new Scanner(System.in);
          System.out.println("Enter Your Education");
          education=in.next();
          System.out.println("Name of Institution");
          institution=in.next();
          System.out.println("Specification");
          specification=in.next();
          System.out.println("Afflicated of Education");
          afflicated=in.next();
          System.out.println("Starting date of your course");
          startDate=in.next();
          System.out.println("Ending date of your course");
          endDate=in.next();
          
          
          EducationBo educations=new EducationBo(education,institution,specification,afflicated,startDate,endDate);
         return educations;
    }
}