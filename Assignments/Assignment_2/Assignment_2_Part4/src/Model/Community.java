/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author palak
 */
public class Community {

    private String CommunityName;

    ArrayList<House> houseList;

    public Community() {

        this.houseList = new ArrayList<House>();
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public House getHouse(int houseNumber) {
        // Getting particular patient based on Name
        for (House house : this.houseList) {
            if (house.getHouseNumber() == houseNumber) {
                return house;
            }
        }
        // Creating New patient if patient is not there
        House house = new House();
        house.setHouseNumber(houseNumber);
        this.houseList.add(house);
        return house;
    }
}
