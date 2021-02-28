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
public class EncounterHistory {

    ArrayList<Encounter> encounterList;

    public EncounterHistory() {
        this.encounterList = new ArrayList<Encounter>();

    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public void addEncounter(Encounter encounter) {
        encounterList.add(encounter);
    }
}
