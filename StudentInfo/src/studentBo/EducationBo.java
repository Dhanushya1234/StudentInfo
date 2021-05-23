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
    private int startDate;

    public EducationBo(String education, String institution, String specification, String afflicated, int year) {
        this.education = education;
        this.institution = institution;
        this.specification = specification;
        this.afflicated = afflicated;
        this.startDate = year;
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

    public int getStartDate() {
        return startDate;
    }
    
    
}
