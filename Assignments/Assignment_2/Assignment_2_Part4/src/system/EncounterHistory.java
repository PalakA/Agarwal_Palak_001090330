/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.ArrayList;

/**
 *
 * @author palak
 */
public class EncounterHistory {
    
    public ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory() {
        this.encounterHistory = new ArrayList<>();
    }
    
    public void addEncounter(Encounter encounter)
    {
        encounterHistory.add(encounter);
    }
    
}
