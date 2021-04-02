/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;
import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author palak
 */
public class OrderDirectory {
    private ArrayList<Order> orderList;
    
    public OrderDirectory() {
        orderList = new ArrayList();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public Order createNewOrder(Customer cust)
    {
        Order order = new Order();
        order.setCustomer(cust);
        orderList.add(order);
        cust.getPastOrderList().add(order);
        return order;
    }

}
