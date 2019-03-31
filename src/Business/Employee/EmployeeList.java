/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class EmployeeList {
    
    private ArrayList<Employee> employeeList;

    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){

        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employeeList.add(employee);
        return employee;
    }
}