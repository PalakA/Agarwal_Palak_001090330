/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business.FoodItems.Menu;
import Business.Orders.Order;
import Business.Orders.OrderDirectory;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private String address;
    private int id;
    private static int count = 1;
    private DeliveryManDirectory deliveryManDirectory;
    private EmployeeDirectory employeeDirectory;
    private OrderDirectory orderDirectory;
    private Menu menu;

    public Restaurant() {
        id = count;
        count++;
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.orderDirectory = new OrderDirectory();
        this.menu = new Menu();
    }
    
    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public Menu getMenu() {
        return menu;
    }
    
    public void deleteOrder(Order o)
    {
        this.getOrderDirectory().getOrderList().remove(o);
    }
    
    public DeliveryMan findDeliveryMan(String name)
    {
        for(DeliveryMan dm : this.deliveryManDirectory.getDeliveryManList())
        {
            if(dm.getName().equals(name))
            {
                return dm;
            }
        }
        return null;
    }
}
