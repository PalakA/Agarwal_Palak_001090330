/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(String name, String phone, String address){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName(name);
        deliveryMan.setPhone(phone);
        deliveryMan.setAddress(address);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
}
