/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author palak
 */

public class VitalSignHistory {
    
    private ArrayList<Vitals> history;
    
    public VitalSignHistory(){
        this.history = new ArrayList<Vitals>();
    }

    public ArrayList<Vitals> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Vitals> history) {
        this.history = history;
    }
    
    public Vitals addNewVitals(){
        
        Vitals newVitals = new Vitals();
        history.add(newVitals);
        return newVitals;
    }

    public void deleteVitals(Vitals selectedVital) {
        history.remove(selectedVital);
    }
        
}