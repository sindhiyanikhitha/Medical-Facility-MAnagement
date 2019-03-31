/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Location.LocationCoordinates;
import Business.Employee.EmployeeList;
import Business.Role.Role;
import Business.UserAccount.UserAccountList;
import Business.Order.OrderQueue;

import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public abstract class Organization {

    private String orgName;
    private OrderQueue orderQueue;
    private EmployeeList employeeList;
    private UserAccountList userAccountList;
    private int organizationID;
    private static int counter;
    private LocationCoordinates locationCoordinates;
    
    public enum Type{
        Admin("Admin Organization"),
        Clinic("Clinic Organization"),
        Inventory("Inventory Organization"),
        CDC("CDC Management Organization"),
        SHD("SHD Management Organization"),
        Supplier("Supplier Organization"),
        Logistics("Logistics Organization"),
        Pharmacy("Pharmacy Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String orgName) {
        this.orgName = orgName;
        orderQueue = new OrderQueue();
        employeeList = new EmployeeList();
        userAccountList = new UserAccountList();
        locationCoordinates = new LocationCoordinates();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRoles();
    
    public UserAccountList getUserAccountList() {
        return userAccountList;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeList getEmployeeList() {
        return employeeList;
    }
    
    public String getOrgName() {
        return orgName;
    }

    public OrderQueue getOrderQueue() {
        return orderQueue;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setOrderQueue(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }

    public void setLocationCoordinates(LocationCoordinates locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }

    public LocationCoordinates getLocationCoordinates() {
        return locationCoordinates;
    }
    
    

    @Override
    public String toString() {
        return orgName;
    }

}
