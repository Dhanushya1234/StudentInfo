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
public class UserBo {
    private int userId;
   private String userName;
    private String userPassword;

    public UserBo(String userName, String userPassword) {
        userId = 1;
        this.userName = userName;
        this.userPassword = userPassword;
    }
    

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
   
    
}
