/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.FoodItems.FoodItem;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author palak
 */
public class Order {
    private Customer customer;
    private int orderId;
    private LocalDateTime orderDate;
    private static int count = 1;
    private ArrayList<FoodItem> foodItemList;
    private DeliveryMan deliveryMan;
    private int totalAmount;
    private String message;
    private boolean status;
    
    public Order() {
        orderId = count;
        count++;
        this.orderDate = LocalDateTime.now();
        this.foodItemList = new ArrayList<FoodItem>();
        this.message = "";
        this.status = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
    
    public void deleteFoodItem(FoodItem foodItem)
    {
        foodItemList.remove(foodItem);
    }
    
    public int calculateTotalAmount()
    {
        int sum = 0;
        for(FoodItem foodItem : this.getFoodItemList())
        {
            sum = sum + foodItem.getPrice();
        }
        this.totalAmount = sum;
        return sum;
    }
    
    public void addItem(FoodItem foodItem)
    {
        foodItemList.add(foodItem);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return Integer.toString(orderId);
    }
    
    
}
