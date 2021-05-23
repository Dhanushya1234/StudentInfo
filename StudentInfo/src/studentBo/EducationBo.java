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
public class EducationBo {
    private String education;
    private String institution;
    private String specification;
    private String afflicated;
    private String startDate;
    private String endDate;

    public EducationBo(String education, String institution, String specification, String afflicated, String startDate,String endDate) {
        this.education = education;
        this.institution = institution;
        this.specification = specification;
        this.afflicated = afflicated;
        this.startDate = startDate;
        this.endDate =endDate;
    }

    public String getEducation() {
        return education;
    }

    public String getInstitution() {
        return institution;
    }

    public String getSpecification() {
        return specification;
    }

    public String getAfflicated() {
        return afflicated;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setAfflicated(String afflicated) {
        this.afflicated = afflicated;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    
    
}
