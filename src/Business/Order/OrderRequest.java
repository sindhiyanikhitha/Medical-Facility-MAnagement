/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Location.LocationCoordinates;
import Business.Enterprise.SupplierEnterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierOrg;
import Business.Patient.Patient;
import Business.SupplierList.Supplier;
import Business.Transport.TransportMode;
import Business.UserAccount.UserAccount;
import Business.VaccineDirectory.Vaccine;
import java.util.Date;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class OrderRequest {


    private UserAccount orderSender;
    private UserAccount orderReceiver;
    private String orderStatus;
    private Date orderRequestDate;
    private Date orderResolvedDate;
    private Supplier supplier;
    private OrderRequest orderRequest;
    private LocationCoordinates sourceLocationCoordinates;
    private LocationCoordinates destinationLocationCoordinates;
    private TransportMode transportMode;
    private double dist;
    private int ETA;
    private SupplierOrg supplierOrg;
    private SupplierEnterprise supplierEnterprise;
    private Organization.Type type;
    private Patient patient;
    private Vaccine vaccine;
    private int quantity;
    private static int count = 0;
    private int orderId;
    
    
    public OrderRequest(){
        orderRequestDate = new Date();
        orderRequest = null;
        count++;
        orderId = count;
        
    }

    public void setResolveDate(){
    
    orderResolvedDate = new Date();
    }
    
    
    public UserAccount getOrderSender() {
        return orderSender;
    }

    public void setOrderSender(UserAccount orderSender) {
        this.orderSender = orderSender;
    }

    public UserAccount getOrderReceiver() {
        return orderReceiver;
    }

    public void setOrderReceiver(UserAccount orderReceiver) {
        this.orderReceiver = orderReceiver;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderRequestDate() {
        return orderRequestDate;
    }

    public void setOrderRequestDate(Date orderRequestDate) {
        this.orderRequestDate = orderRequestDate;
    }

    public Date getOrderResolvedDate() {
        return orderResolvedDate;
    }

    public void setOrderResolvedDate(Date orderResolvedDate) {
        this.orderResolvedDate = orderResolvedDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
        
    }

    public int getOrderId() {
        return orderId;
    }
    
     
    public OrderRequest createAndGetNewOrderRequest() {
        if (orderRequest ==null){
        orderRequest = new OrderRequest() {};
        
        }
        return orderRequest;
    }
    public OrderRequest getLastOrderRequest(){
        OrderRequest nOR = this;
        while(nOR.getOrderRequest()!=null){
            nOR = nOR.getOrderRequest();
        }
        return nOR;
    
    }

    public LocationCoordinates getSourceLocationCoordinates() {
        return sourceLocationCoordinates;
    }

    public void setSourceLocationCoordinates(LocationCoordinates sourceLocationCoordinates) {
        this.sourceLocationCoordinates = sourceLocationCoordinates;
    }

    public LocationCoordinates getDestinationLocationCoordinates() {
        return destinationLocationCoordinates;
    }

    public void setDestinationLocationCoordinates(LocationCoordinates destinationLocationCoordinates) {
        this.destinationLocationCoordinates = destinationLocationCoordinates;
    }

    public TransportMode getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public int getETA() {
        return ETA;
    }

    public void setETA(int ETA) {
        this.ETA = ETA;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SupplierOrg getSupplierOrg() {
        return supplierOrg;
    }

    public void setSupplierOrg(SupplierOrg supplierOrg) {
        this.supplierOrg = supplierOrg;
    }

    public SupplierEnterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(SupplierEnterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }

    public Organization.Type getType() {
        return type;
    }

    public void setType(Organization.Type type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
    return this.getOrderSender().getUsername();
    }
}
