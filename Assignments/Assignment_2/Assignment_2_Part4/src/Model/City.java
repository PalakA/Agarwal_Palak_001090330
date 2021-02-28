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
public class City {
    
    private String cityName;
    ArrayList<Community> communityList;

    public City() {
        
        this.communityList = new ArrayList<Community>();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community getCommunity(String communityName) {
        for (Community community : this.communityList) {
            if (community.getCommunityName().equalsIgnoreCase(communityName)) {
                return community;
            }
        }
        Community community = new Community();
        community.setCommunityName(communityName);
        this.communityList.add(community);
        return community;
    }
}
