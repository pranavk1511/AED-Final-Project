/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Role.Role;
import java.util.ArrayList;
import Business.WorkQueue.WorkQueue;
import Business.UserAccount.UserAccountDirectory;
import Business.Employee.EmployeeDirectory;

/**
 *
 * @author Pranav
 */
public abstract class Organization {
    

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    // private SupplierEmpDirectory supplierEmpDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        PharmacyAdmin("PharmacyAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SupplierAdmin("SupplierAdmin"),
        SupplierDeliveryMan("SupplierDeliveryMan"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        //supplierEmpDirectory = new SupplierEmpDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

   // public SupplierEmpDirectory getSupplierEmpDirectory() {
       // return supplierEmpDirectory;
    //}
    
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

