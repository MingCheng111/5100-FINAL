/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author JINLANG
 */
public class EmployeeDirectory {
    private HashMap<Integer, Employee> employees;

    public HashMap<Integer, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public EmployeeDirectory() {
        this.employees = new HashMap<>();
    }
    
    public Employee addEmployee(){
        Employee e = new Employee();
        employees.put(e.getId(), e);
        return e;
    }
    
    
}
