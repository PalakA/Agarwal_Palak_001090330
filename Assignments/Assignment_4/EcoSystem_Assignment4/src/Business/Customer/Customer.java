/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Orders.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private int id;
    private String address;
    private String phone;
    private static int count = 1;
    private ArrayList<Order> PastOrderList;

    public Customer() {
        id = count;
        count++;
        this.PastOrderList = new ArrayList<Order>();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Order> getPastOrderList() {
        return PastOrderList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void AddOrder()
    {
        
    }
}
