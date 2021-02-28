/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.City;
import Model.Community;
import Model.Encounter;
import Model.EncounterHistory;
import Model.House;
import Model.Patient;
import Model.PatientList;
import Model.VitalSigns;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author palak
 */
public class VitalSignsMain {

    public static void main(String[] args) {

        PatientList patientList = new PatientList();
        ArrayList<City> cityList = new ArrayList<City>();
        options(patientList, cityList);
    }

    public static void options(PatientList patientList, ArrayList<City> cityList) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int choice = 0;
        instructions();

        while (!exit) {
            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    addVitalSign(patientList, cityList);
                    instructions();
                    break;
                case 2:
                    displayHistory(patientList);
                    instructions();
                    break;
                case 3:
                    isThisVitalSignNormal(patientList);
                    instructions();
                    break;

                case 4:
                    isBPNormalOfTheCommunity(patientList, cityList);
                    instructions();
                    break;
                case 5:
                    System.out.println("\n");
                    exit = true;
                    break;
            }
        }
    }

    public static void instructions() {
        System.out.println("\nOptions to select: ");
        System.out.println("\t 1 - To Add new record. ");
        System.out.println("\t 2 - To Display records. ");
        System.out.println("\t 3 - To Check the vital signs status. ");
        System.out.println("\t 4 - To Check Blood Pressure is abnormal in the Community. ");
        System.out.println("\t 5 - To Quit the application.");
    }

    // Function used to add New Vital Sign
    public static void addVitalSign(PatientList patientList, ArrayList<City> cityList) {

        VitalSigns vitalSigns = new VitalSigns();
        Encounter encounter = new Encounter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patients full name:");
        String patientFullName = scanner.nextLine();
        if (patientFullName.matches("[0-9]+") && patientFullName.length() > 2) {
            System.out.println("Contains Digits. Enter the Name");
            System.out.println("Please enter patient name");
            patientFullName = scanner.next();
        }
        Patient patient = patientList.getPatient(patientFullName);
        System.out.println("\nNote: For Newborn enter value of age as 0 "
                + "and for less than 1 year i.e. 1-12 months enter value of age as 1.");
        System.out.println("Enter age here:");
        try {

            vitalSigns.setAge(scanner.nextInt());

        } catch (Exception e) {
            System.out.println("Age Error");
            scanner.next();
            System.out.println("Enter age here:");
            vitalSigns.setAge(scanner.nextInt());
        }
        
        System.out.println("Enter the City:");
        String cityName = scanner.next(); 
        if (cityName.matches("[0-9]+") && cityName.length() > 2) {
            System.out.println("Contains Digits. Enter the City Name");
            System.out.println("Please enter City name");
            patientFullName = scanner.next();
        }      

        City city = getCity(cityName, cityList);
        System.out.println("Enter the Community Name:");
        String communityName = scanner.next(); 
        if (cityName.matches("[0-9]+") && cityName.length() > 2) {
            System.out.println("Contains Digits. Enter the Community Name");
            System.out.println("Please enter Community name");
            patientFullName = scanner.next();
        } 

        Community community = city.getCommunity(communityName);
        System.out.println("Enter the House Number:");
        int houseNumber;
        try {

            houseNumber = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("House Number Error");
            scanner.next();
            System.out.println("Enter House Number here:");
            houseNumber = scanner.nextInt();
        }
        House house = community.getHouse(houseNumber);
        System.out.println("Enter Patients Respiratory Rate:");
        try {

            vitalSigns.setRespiratoryRate(scanner.nextDouble());

        } catch (Exception e) {
            System.out.println("Respiratory Rate Error");
            scanner.next();
            System.out.println("Enter Respiratory Rate here:");
            vitalSigns.setRespiratoryRate(scanner.nextDouble());
        }

        System.out.println("Enter Patients Heart Rate:");
        try {

            vitalSigns.setHeartRate(scanner.nextDouble());

        } catch (Exception e) {
            System.out.println("Heart Rate Error");
            scanner.next();
            System.out.println("Enter Heart Rate here:");
            vitalSigns.setHeartRate(scanner.nextDouble());
        }

        System.out.println("Enter Patients Blood Pressure:");
        try {

            vitalSigns.setBloodPressure(scanner.nextDouble());

        } catch (Exception e) {
            System.out.println("Blood Pressure Error");
            scanner.next();
            System.out.println("Enter Blood Pressure here:");
            vitalSigns.setBloodPressure(scanner.nextDouble());
        }

        System.out.println("Enter Patients Weight in Kgs:");
        try {

            vitalSigns.setWeightKg(scanner.nextDouble());

        } catch (Exception e) {
            System.out.println("Weight in Kg Error");
            scanner.next();
            System.out.println("Enter Weight in Kg  here:");
            vitalSigns.setWeightKg(scanner.nextDouble());
        }

        System.out.println("Enter Patients Weight in pounds:");
        try {

            vitalSigns.setWeightInPounds(scanner.nextDouble());

        } catch (Exception e) {
            System.out.println("Weight in Pounds Error");
            scanner.next();
            System.out.println("Enter Weight in Pounds here:");
            vitalSigns.setWeightInPounds(scanner.nextDouble());
        }

        vitalSigns.setIsRecent(true);
        System.out.println("\nVital signs entry successful");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        patient.getEncounterHistory().addEncounter(encounter);
        patient.setHouse(house);
        patient.setCity(city);
        patient.setCommunity(community);
        encounter.setPatient(patient);
        house.getPatientList().add(patient);
        encounter.setVitalSigns(vitalSigns);
        encounter.setTimeStamp(timestamp.toString());
    }

    public static City getCity(String cityName, ArrayList<City> cityList) {

        for (City city : cityList) {
            if (city.getCityName().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        // Creating New patient if patient is not there
        City city = new City();
        city.setCityName(cityName);
        cityList.add(city);
        return city;
    }

// Function used to display Vital sign history
    private static void displayHistory(PatientList patientList) {
        System.out.println("VitalSigns History: ");
        for (Patient patient : patientList.getPatientList()) {
            patient.displayVitalSignsHistory();
        }
    }

    // Function used to check whether the Vital Sign is Normal or Abnormal
    private static void isThisVitalSignNormal(PatientList patientList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter patient's full name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your vital sign attribute: ");
        System.out.println("\n\"RespiratoryRate\"");
        System.out.println("\"HeartRate\"");
        System.out.println("\"BloodPressure\"");
        System.out.println("\"WeightInKg\"");
        System.out.println("\"WeightInPd\"");
        String selectedOption = scanner.nextLine();
        Patient patient = patientList.getPatient(name);
        boolean result = false;

        switch (selectedOption) {
            case "RespiratoryRate":
                result = patient.isThisVitalSignNormal("RespiratoryRate");
                break;

            case "HeartRate":
                result = patient.isThisVitalSignNormal("HeartRate");
                break;

            case "BloodPressure":
                result = patient.isThisVitalSignNormal("BloodPressure");
                break;

            case "WeightInKg":
                result = patient.isThisVitalSignNormal("WeightInKgs");
                break;

            case "WeightInPd":
                result = patient.isThisVitalSignNormal("WeightInPds");
                break;
        }

        if (result) {
            System.out.println("\nVital sign is normal");
        } else {
            System.out.println("\nVital sign is abnormal");
        }
    }

    private static void isBPNormalOfTheCommunity(PatientList patientList, ArrayList<City> cityList) {

        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the City:");
        String cityName = scanner.next();
        City city = getCity(cityName, cityList);
        System.out.println("Enter th Community Name:");
        String communityName = scanner.next();
        Community community = city.getCommunity(communityName);

        ArrayList<House> houseList = community.getHouseList();
        for (House house : houseList) {
            ArrayList<Patient> patientLists = house.getPatientList();
            for (Patient patient : patientLists) {
                EncounterHistory encounterList = patient.getEncounterHistory();
                for (Encounter encounter : encounterList.getEncounterList()) {
                    VitalSigns vitalSigns = encounter.getVitalSigns();
                    if (!(vitalSigns.isBloodPressureNormal())) {
                        counter++;
                        System.out.println("Blood Pressure of the Patient in " + communityName + " is " + vitalSigns.getBloodPressure());
                        System.out.println("Blood Pressure of the Patient is abnormal.");
                    }
                }
            }
        }
        System.out.println("Count of Patients in the " + communityName + " with abnormal Blood Pressure  is " + counter);
    }
}
