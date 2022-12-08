/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UerAccount;

import Employee.Employee;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author JINLANG
 */
public class UserAccountDirectory {
    private  ArrayList<UserAccount> userList;
    
    public UserAccountDirectory() {
        userList = new ArrayList();
    }
    
    public UserAccount createUserAccount(String userAccount, String passward, Role role, Employee employee){
        UserAccount user = new UserAccount(userAccount, passward, role, employee);
        userList.add(user);
        return user;
    }

    public ArrayList<UserAccount> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<UserAccount> userList) {
        this.userList = userList;
    }
    
    public boolean checkUserAccountIsUnique(String userAccount){
        for (UserAccount ua : userList){
            if (ua.getAccount().equals(userAccount))
                return false;
        }
        return true;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userList)
            if (ua.getAccount().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
}
