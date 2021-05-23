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
    String name;
    String gender;
    String dob;
    int age;
    String address;
    int mobileNo;

    public StudentBo(String name, String gender, String dob, int age, String address, int mobileNo) {
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

    public int getMobileNo() {
        return mobileNo;
    }
    
}
