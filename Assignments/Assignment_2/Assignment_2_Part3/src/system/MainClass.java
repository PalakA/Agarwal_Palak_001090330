/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author palak
 */
public class MainClass {

    public static void main(String[] args) {
        PatientDirectory patientDirectory = new PatientDirectory();
        startMenu(patientDirectory);
    }
    
    // User Input
    public static void printMenu() {
        System.out.println("\nEnter 1 if you want to create a new Patient Record \n Enter 2 if you want to view history of all the patients"
               + "\n Enter 3 if you want to check vital sign status \n Enter 4 to quit the application");
    }
    
    private static void startMenu(PatientDirectory patientDirectory) {
        Scanner scanObj = new Scanner(System.in);
        
        boolean exit = false;
        int sUserInput;

        printMenu();

        while (!exit) {
            System.out.println("\nEnter your choice: ");
            sUserInput = scanObj.nextInt();
            scanObj.nextLine();

            switch (sUserInput) {
                case 1:
                    addVSigns(patientDirectory);
                    printMenu();
                    break;
                case 2:
                    displayRecords(patientDirectory);
                    printMenu();
                    break;
                case 3:
                    isThisVitalSignNormal(patientDirectory);
                    printMenu();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
    
    public static void addVSigns(PatientDirectory patientDirectory) {
        
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter Patient's Full Name:");

        String patientName = scanObj.nextLine();

        Patient patient = patientDirectory.getPatient(patientName);
                
        System.out.println("\nEnter Patient's Age:");
        double ageGroup = scanObj.nextDouble();

        System.out.println("\nEnter Patient's Respiratory rate:");
        int respiratoryRate = scanObj.nextInt();

        System.out.println("\nEnter Patient's Heart Rate: ");
        int heartRate = scanObj.nextInt();

        System.out.println("\nEnter Patient's Blood Pressure: ");
        int sysBloodPressure = scanObj.nextInt();

        System.out.println("\nEnter Patient's Weight (in Kilos):");
        double weightInKgs = scanObj.nextDouble();
        
        System.out.println("\nEnter Patient's Weight (in Pounds):");
        double weightinPounds = scanObj.nextDouble();
        
        VitalSigns vitalSign = new VitalSigns();
        vitalSign.setAgeGroup(ageGroup);
        vitalSign.setRespiratoryRate(respiratoryRate);
        vitalSign.setHeartRate(heartRate);
        vitalSign.setBloodPressure(sysBloodPressure);
        vitalSign.setWeightInKilos(weightInKgs);
        vitalSign.setWeightinPounds(weightinPounds);
        vitalSign.setIsRecent(true);
        
        //Creating encounter object
        Encounter enc = new Encounter();
        enc.setPatient(patient);
        enc.setVitalSigns(vitalSign);
        
        patient.getEncounterHistory().addEncounter(enc);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
        enc.setTimeStamp(timeStamp.toString());
        System.out.println("\nVital signs added successful");

    }
    
    private static void displayRecords(PatientDirectory patientDirectory) {
        System.out.println("VitalSigns-History: ");
        for (Patient p : patientDirectory.getPatientDirectory()) {
            System.out.println("\n\nPatient Name: " + p.getName());
            p.printVitalSignsHistory();
        }
    }
    
    private static void isThisVitalSignNormal(PatientDirectory patientDirectory) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("\nEnter Patient's Full Name: ");

        String name = scanObj.nextLine();

        System.out.println("\nEnter Vital sign attribute: ");
        System.out.println("\n\"RespiratoryRate\"");
        System.out.println("\"HeartRate\"");
        System.out.println("\"BloodPressure\"");
        System.out.println("\"WeightInKg\"");
        System.out.println("\"WeightInPd\"");

        String selectedOption = scanObj.nextLine();

        Patient p = patientDirectory.getPatient(name);

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
}
