/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;
public class UserCreate { 
    String name="dhanu";
    String password="xyz";
    boolean checkuser(String _name){
        return name.equals(_name);
    }
    boolean checkpass(String _password){
        return password.equals(_password);    
    }
}
