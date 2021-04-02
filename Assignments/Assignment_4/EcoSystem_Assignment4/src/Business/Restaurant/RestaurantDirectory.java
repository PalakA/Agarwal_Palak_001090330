/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }
    
    public Restaurant createRestaurant(String name, String address){
        Restaurant restaurant = new Restaurant();
        if(this.checkIfRestaurantIsUnique(name))
        {
            restaurant.setName(name);
            restaurant.setAddress(address);
            restaurantList.add(restaurant);
            return restaurant;
        }
        return null;
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    public boolean checkIfRestaurantIsUnique(String restaurant){
        for (Restaurant r : restaurantList){
            if (r.getName().equals(restaurant))
                return false;
        }
        return true;
    }
    
    public Restaurant findEmployee(Employee employee)
    {
        for(Restaurant r : restaurantList)
        {
            
        }
        return null;
    }
    
    public void deleteRestaurant(Restaurant r)
    {
        restaurantList.remove(r);        
    }
    
    public Restaurant findRestaurant(String name)
    {
        for(Restaurant r : restaurantList)
        {
            if(r.getName().equals(name))
            {
                return r;
            }
        }
        return null;
    }
}
