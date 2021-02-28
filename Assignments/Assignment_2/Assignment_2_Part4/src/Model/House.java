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
public class House {

    private int HouseNumber;
    
    ArrayList<Patient> patientList;

    public House() {
        this.patientList = new ArrayList<Patient>();
    }

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int HouseNumber) {
        this.HouseNumber = HouseNumber;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient getPatient(String fullName) {

        for (Patient patient : this.patientList) {
            if (patient.getFullName().equalsIgnoreCase(fullName)) {
                return patient;
            }
        }

        Patient patient = new Patient(fullName);
        this.patientList.add(patient);
        return patient;
    }
}
