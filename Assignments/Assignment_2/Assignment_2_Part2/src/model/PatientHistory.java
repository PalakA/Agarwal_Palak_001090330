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
public class PatientHistory {
    
    private ArrayList<Patient> patientHistory;

    public PatientHistory() {
        this.patientHistory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }

    public Patient getPatient(String fullName) {
        for (Patient p : this.patientHistory) {
            if (p.getFullName().toLowerCase().equals(fullName.toLowerCase())) {
                return p;
            }
        }
        Patient p = new Patient(fullName);
        this.patientHistory.add(p);
        return p;
    }
}
