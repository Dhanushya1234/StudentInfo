/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentBo;

/**
 *
 * @author lenovo
 */
public class CertificateBo {
    private String activity;
    private String nameofCertificate;
    private String dateofCertificate;
    private String organizer;
    private String desc;
    
    public CertificateBo(String activity,String nameofCertificate, String dateofCertificate, String organizer, String desc) {
        this.nameofCertificate = nameofCertificate;
        this.dateofCertificate = dateofCertificate;
        this.organizer = organizer;
        this.desc = desc;
        this.activity = activity;
    }
    
    
    public String getNameofCertificate() {
        return nameofCertificate;
    }

    public String getDateofCertificate() {
        return dateofCertificate;
    }

    public String getOraganizer() {
        return organizer;
    }

    public String getDesc() {
        return desc;
    }

    public String getActivity() {
        return activity;
    }
    

    
    
    public void setNameofCertificate(String nameofCertificate) {
        this.nameofCertificate = nameofCertificate;
    }

    public void setDateofCertificate(String dateofCertificate) {
        this.dateofCertificate = dateofCertificate;
    }

    public void setOraganizer(String oraganizer) {
        this.organizer = oraganizer;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
    
      
}
 