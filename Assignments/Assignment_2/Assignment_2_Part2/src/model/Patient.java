/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author palak
 */
public class Patient {

    private String fullName;
    private PatientHistory patientHistory;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private VitalSignHistory vitalSignsHistory;

    public Patient(String fullName) {
        this.fullName = fullName;
        this.vitalSignsHistory = new VitalSignHistory();
    }

    // Add a new vital sign
    public VitalSignHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    public static void main(String[] args) {
        Patient mc = new Patient();
        mc.startMenu();
    }

    public Patient() {
        this.patientHistory = new PatientHistory();
    }
    
    public void addPatient() {
        
       //Declare Variables
       double ageGroup;
       int respiratoryRate;
       int heartRate;
       int bloodPressure;
       double weightInKilos;
       double weightinPounds;
       String date;
       String patientName;
       
       //created Scanner object to take user input
       Scanner inputObj = new Scanner(System.in);
       
        System.out.println("\nEnter Date:");
        date = inputObj.nextLine();

        System.out.println("Enter Patient's Full Name:");
        patientName = inputObj.nextLine();

        Patient patient = this.patientHistory.getPatient(patientName);
        
        System.out.println("Enter Patient's Age:");
        ageGroup = inputObj.nextDouble();

        System.out.println("Enter Patient's Respiratory rate:");
        respiratoryRate = inputObj.nextInt();

        System.out.println("Enter Patient's Heart rate:");
        heartRate = inputObj.nextInt();

        System.out.println("Enter Patient's Blood Pressure:");
        bloodPressure = inputObj.nextInt();

        System.out.println("Enter Patient's Weight (in Kilos):");
        weightInKilos = inputObj.nextDouble();

        System.out.println("Enter Patient's Weight (in Pounds):");
        weightinPounds = inputObj.nextDouble();

        patient.addNewVitalSign(ageGroup, respiratoryRate, heartRate, bloodPressure, weightInKilos, weightinPounds, date);
        
        System.out.println("\nVital signs added successful");
    }

    public static void printMenu() {
        
       System.out.println("\nEnter 1 if you want to create a new Patient \n Enter 2 if you want to view history of the patient \n"
               + " Enter 3 if you want to check vital sign status \n Enter 4 to quit the application");
    }
   
    VitalSignHistory history;

    // Check vital signs status      
    private void isThisVitalSignNormal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Patient's Full Name: ");

        String name = scanner.nextLine();

        System.out.println("\nEnter Vital sign attribute: ");
        System.out.println("\n\"RespiratoryRate\"");
        System.out.println("\"HeartRate\"");
        System.out.println("\"BloodPressure\"");
        System.out.println("\"WeightInKg\"");
        System.out.println("\"WeightInPd\"");

        String selectedOption = scanner.nextLine();

        Patient p = this.patientHistory.getPatient(name);

        boolean result = false;

        switch (selectedOption) {
            case "RespiratoryRate":
                result = p.isThisVitalSignNormal("RespiratoryRate");
                break;

            case "HeartRate":
                result = p.isThisVitalSignNormal("HeartRate");
                break;

            case "BloodPressure":
                result = p.isThisVitalSignNormal("BloodPressure");
                break;

            case "WeightInKg":
                result = p.isThisVitalSignNormal("WeightInKgs");
                break;

            case "WeightInPd":
                result = p.isThisVitalSignNormal("WeightInPounds");
                break;
        }

        if (result) {
            System.out.println("\nVital sign is Normal");
        } else {
            System.out.println("\nVital sign is Abnormal");
        }
    }
    
    private void startMenu() {

       int sUserInput;
       boolean quit = false;
       Scanner scanner = new Scanner(System.in);
       
       printMenu();
       
        while (!quit) {
            System.out.println("\nEnter your choice: ");
            sUserInput = scanner.nextInt();
            scanner.nextLine();

            switch (sUserInput) {
                case 1:
                    addPatient();
                    printMenu();
                    break;
                case 2:
                    displayPatientHistory();
                    printMenu();
                    break;
                case 3:
                    isThisVitalSignNormal();
                    printMenu();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    private void addNewVitalSign(double ageGroup, int respiratoryRate, int heartRate, int bloodPressure, double weightInKilos, double weightinPounds, String date) {
        for (int i = 0; i < this.vitalSignsHistory.getHistory().size(); i++) {
            VitalSigns vs = this.vitalSignsHistory.getHistory().get(i);
            if (vs.getisIsRecent()) {
                vs.setIsRecent(false);
            }
        }
                
        VitalSigns vs = new VitalSigns();

        //Set user input varaibles to the object
        vs.setDate(date);
        vs.setAgeGroup(ageGroup);
        vs.setRespiratoryRate(respiratoryRate);
        vs.setHeartRate(heartRate);
        vs.setBloodPressure(bloodPressure);
        vs.setWeightInKilos(weightInKilos);
        vs.setWeightinPounds(weightinPounds);
        vs.setIsRecent(true);
        this.vitalSignsHistory.addNewVitals(vs);
    }

    //Display vital signs
    private void displayPatientHistory() {
        System.out.println("\nPatient History: ");
        for (Patient p : this.patientHistory.getPatientHistory()) {
            System.out.println("\nPatient Name: " + p.getFullName());
            p.displayVitalSignHistory();
        }
    }
    
    public void displayVitalSignHistory() {

        for (int i = 0; i < this.vitalSignsHistory.getHistory().size(); i++) {
            VitalSigns vs = this.vitalSignsHistory.getHistory().get(i);
            System.out.println("\nRecord No. " + (i + 1) + " :");
            System.out.println("Date: " + vs.getDate());
            System.out.println("Age: " + vs.getAgeGroup());
            System.out.println("Respiratory rate: " + vs.getRespiratoryRate());
            System.out.println("Heart rate: " + vs.getHeartRate());
            System.out.println("Blood pressure: " + vs.getBloodPressure());
            System.out.println("Weight in kgs: " + vs.getWeightInKilos());
            System.out.println("Weight in Pounds: \n" + vs.getWeightinPounds());        
        }
    }
    
    public boolean isThisVitalSignNormal(String selectedVialSign) {
        for (VitalSigns vs : this.vitalSignsHistory.getHistory()) {
            if (vs.getisIsRecent()) {
                return vs.isThisVitalSignNormal(selectedVialSign);
            }
        }
        return false;
    }
}