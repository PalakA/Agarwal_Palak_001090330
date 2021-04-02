/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodItems;

import java.util.ArrayList;

/**
 *
 * @author palak
 */
public class Menu {
    private ArrayList<FoodItem> menuList;
    
    public Menu() {
        menuList = new ArrayList();
    }

    public ArrayList<FoodItem> getFoodItemList() {
        return menuList;
    }
    
    public boolean checkIfFoodItemIsUnique(String name){
        for (FoodItem fi : menuList){
            if (fi.getName() == name)
                return false;
        }
        return true;
    }
    
    public FoodItem createNewFoodItem(String name, int price)
    {
        FoodItem fi = new FoodItem(name, price);
        menuList.add(fi);
        return fi;
    }
    
    public void deleteFoodItem(FoodItem foodItem)
    {
        menuList.remove(foodItem);
    }
}
