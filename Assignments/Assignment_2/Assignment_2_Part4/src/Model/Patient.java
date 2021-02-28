/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author palak
 */
public class Patient extends Person {

    EncounterHistory encounterHistory;
    PatientList patientList;
    House house;
    City city;
    Community community;

    public PatientList getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientList patientList) {
        this.patientList = patientList;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    public Patient(String fullName) {
        this.encounterHistory = new EncounterHistory();
        this.patientList = new PatientList();
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getFullName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public boolean isThisVitalSignNormal(String selectedVitalSignName) {
        for (Encounter encounter : this.encounterHistory.encounterList) {
            VitalSigns vitalSigns = encounter.getVitalSigns();
            if (vitalSigns.getIsRecent()) {
                return vitalSigns.isThisVitalSignNormal(selectedVitalSignName);
            }
        }
        return false;
    }

    public void displayVitalSignsHistory() {
        int i = 0;
        for (Encounter encounter : encounterHistory.encounterList) {
            VitalSigns vitalSigns = encounter.getVitalSigns();
            System.out.println("\nPatient Name: " + super.getName());
            System.out.println("Patient Record Number: " + (++i));
            System.out.println("Time Stamp: " + encounter.getTimeStamp());
            System.out.println("age: " + vitalSigns.getAge());
            System.out.println("respiratoryRate: " + vitalSigns.getRespiratoryRate());
            System.out.println("heartrate: " + vitalSigns.getHeartRate());
            System.out.println("bloodPressure: " + vitalSigns.getBloodPressure());
            System.out.println("weightInKgs: " + vitalSigns.getWeightKg());
            System.out.println("wightinPds: " + vitalSigns.getWeightInPounds()); 
            System.out.println("House Number: " + this.house.getHouseNumber());
            System.out.println("City Name: " + this.city.getCityName());
            System.out.println("Community Name: " + this.community.getCommunityName());
        }
    }
}
