package Business;

import Business.Customer.CustomerDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.SupplierDeliverMan.SupplyDeliveryManDirectory;
import Business.Supplier.SupplierDirectory;
import Business.SupplierEmp.SupplierEmpDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Role.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pranav
 */
public class Ecosystem extends Organization {
    private static Ecosystem business;
    private PharmacyDirectory pharmacyDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private SupplierDirectory supplierDirectory;
    private SupplyDeliveryManDirectory supplierDeliveryManDirectory;

    public Ecosystem(PharmacyDirectory pharmacyDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, SupplierDirectory supplierDirectory, SupplyDeliveryManDirectory supplierDeliveryManDirectory) {

        this.pharmacyDirectory = pharmacyDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
                this.supplierDirectory = supplierDirectory;
                        this.supplierDeliveryManDirectory = supplierDeliveryManDirectory;

    }

    
    
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Ecosystem(){
        super(null);
       // networkList=new ArrayList<Network>();
        this.pharmacyDirectory = new PharmacyDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
         this.supplierDirectory = new SupplierDirectory();

                        this.supplierDeliveryManDirectory = new SupplyDeliveryManDirectory();
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    } 
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public SupplyDeliveryManDirectory getSupplierDeliveryManDirectory() {
        return supplierDeliveryManDirectory;
    }
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
