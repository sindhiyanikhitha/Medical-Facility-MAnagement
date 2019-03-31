/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Employee {
    
    private String employeeName;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return employeeName;
    }
    
    
}
