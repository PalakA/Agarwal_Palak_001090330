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
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public Patient getPatient(String name) {
        for (Patient p : this.patientDirectory) {
            if (p.getName().toLowerCase().equals(name.toLowerCase())) {
                return p;
            }
        }
        Patient p = new Patient(name);
        this.patientDirectory.add(p);
        return p;
    }   
}
