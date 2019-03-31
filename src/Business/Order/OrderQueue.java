/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;


/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class OrderQueue {
    
    private ArrayList<OrderRequest> orderRequests;

    public OrderQueue() {
        orderRequests = new ArrayList<>();
    }

    public ArrayList<OrderRequest> getOrderRequests() {
        return orderRequests;
    }
    
    public OrderRequest addOrderRequest(){
        OrderRequest orderRequest = new OrderRequest();
        orderRequests.add(orderRequest);
        return orderRequest;
    }
    
    public void removeOrderRequest(OrderRequest orderRequest){
        this.orderRequests.remove(orderRequest);
    }
}