/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UerAccount;

import Employee.Employee;
import Role.Role;
import WorkQueue.WorkQueue;

/**
 *
 * @author JINLANG
 */
public class UserAccount {
    private String account;
    private String password;
    private Role role;
    private WorkQueue workQueue;
    private Employee employee;

    public String getAccount() {
        return account;
    }



    public UserAccount(String account, String passward, Role role, Employee employee) {
        this.account = account;
        this.password = passward;
        this.role = role;
        this.employee = employee;
        this.workQueue = new WorkQueue();
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passward) {
        this.password = passward;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
