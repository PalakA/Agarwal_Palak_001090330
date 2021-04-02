/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodItems;

/**
 *
 * @author palak
 */
public class FoodItem {
    private int id;
    private String name;
    private int price;
    private static int count = 1;

    public FoodItem(String name, int price) {
        id = count;
        count++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
