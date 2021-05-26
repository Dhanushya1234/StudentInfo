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
public class StudentBo {
    private String name;
    private String gender;
    private String dob;
    private int age;
    private String address;
    private String mobileNo;

    public StudentBo(String name, String gender, String dob, int age, String address, String mobileNo) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;   
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
}
