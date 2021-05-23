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
public class ExtraCurricularBo {
    private String activityType;
    private String activity;
    private String nameofCertificate;
    private String dateofCertificate;
    private String oraganizer;
    private String desc;

    public ExtraCurricularBo(String activityType, String activity, String nameofCertificate, String dateofCertificate, String oraganizer, String desc) {
        this.activityType = activityType;
        this.activity = activity;
        this.nameofCertificate = nameofCertificate;
        this.dateofCertificate = dateofCertificate;
        this.oraganizer = oraganizer;
        this.desc = desc;
    }
    

    public String getActivityType() {
        return activityType;
    }

    public String getActivity() {
        return activity;
    }

    public String getNameofCertificate() {
        return nameofCertificate;
    }

    public String getDateofCertificate() {
        return dateofCertificate;
    }

    public String getOraganizer() {
        return oraganizer;
    }

    public String getDesc() {
        return desc;
    }

    public void setNameofCertificate(String nameofCertificate) {
        this.nameofCertificate = nameofCertificate;
    }

    public void setDateofCertificate(String dateofCertificate) {
        this.dateofCertificate = dateofCertificate;
    }

    public void setOraganizer(String oraganizer) {
        this.oraganizer = oraganizer;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
