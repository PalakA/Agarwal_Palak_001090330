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

    public static boolean isPatientNormal(VitalSigns vitalSigns) {
        
       boolean bPatientNormal = false;
       double ageGroup        = vitalSigns.getPatientAge();
       int respiratoryRate    = vitalSigns.getRespiratoryRate();
       int heartRate          = vitalSigns.getHeartRate();
       int bloodPressure      = vitalSigns.getBloodPressure();
       double weightInKilos   = vitalSigns.getWeightInKilos();
       double weightinPounds  = vitalSigns.getWeightinPounds();
       
       if(ageGroup == 0)
       {    //Newborns Vitals
           if((respiratoryRate>=30 && respiratoryRate<=50) && (heartRate>=120 && heartRate<=160) 
               && (bloodPressure>=50 && bloodPressure<=70) && (weightInKilos>=2 && weightInKilos<=3) && (weightinPounds>=4.5 && weightinPounds<=7))
           {
               bPatientNormal = true;
           }
       }
       else if(ageGroup>0 && ageGroup<=1)
       {   //Infants Vitals
           if((respiratoryRate>=20 && respiratoryRate<=30) && (heartRate>=80 && heartRate<=140) 
               && (bloodPressure>=70 && bloodPressure<=100) && (weightInKilos>=4 && weightInKilos<=10) && (weightinPounds>=9 && weightinPounds<=22))
           {
               bPatientNormal = true;
           }
       }
       else if(ageGroup>1 && ageGroup<=3)
       {   //Todlers
           if((respiratoryRate>=20 && respiratoryRate<=30) && (heartRate>=80 && heartRate<=130) 
               && (bloodPressure>=80 && bloodPressure<=110) && (weightInKilos>=10 && weightInKilos<=14) && (weightinPounds>=22 && weightinPounds<=31))
           {
               bPatientNormal = true;
           }
       }
       else if(ageGroup>3 && ageGroup<=5)
       {   //Preschoolers
           if((respiratoryRate>=20 && respiratoryRate<=30) && (heartRate>=80 && heartRate<=120) 
               && (bloodPressure>=80 && bloodPressure<=110) && (weightInKilos>=14 && weightInKilos<=18) && (weightinPounds>=31 && weightinPounds<=40))
           {
               bPatientNormal = true;
           }
       }
       else if(ageGroup>=6 && ageGroup<=12)
       {   //School Age
           if((respiratoryRate>=20 && respiratoryRate<=30) && (heartRate>=70 && heartRate<=110) 
               && (bloodPressure>=80 && bloodPressure<=120) && (weightInKilos>=20 && weightInKilos<=42) && (weightinPounds>=41 && weightinPounds<=92))
           {
               bPatientNormal = true;
           }
       }
       else if(ageGroup>=13)
       {   //Adolescent
           if((respiratoryRate>=12 && respiratoryRate<=20) && (heartRate>=55 && heartRate<=105) 
               && (bloodPressure>=110 && bloodPressure<=120) && (weightInKilos<50) && (weightinPounds<110))
           {
               bPatientNormal = true;
           }
       }
           return bPatientNormal;
    }
    
    public static void main(String[] args) {

       //Declare Variables
       double patientAge;
       int respiratoryRate;
       int heartRate;
       int bloodPressure;
       double weightInKilos;
       double weightinPounds;
       String patientName;
       
       //created Scanner object to take user input
       Scanner inputObj = new Scanner(System.in);
       
       //Instantiated VitalSigns class object
       VitalSigns patientVitals = new VitalSigns();

        System.out.println("Enter Patient's Name:");
        patientName = inputObj.nextLine();

        System.out.println("Enter Patient's Age Group:");
        patientAge = inputObj.nextDouble();

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

        patientVitals.setPatientAge(patientAge);
        patientVitals.setRespiratoryRate(respiratoryRate);
        patientVitals.setHeartRate(heartRate);
        patientVitals.setBloodPressure(bloodPressure);
        patientVitals.setWeightInKilos(weightInKilos);
        patientVitals.setWeightinPounds(weightinPounds);
       
       System.out.println(patientName+"'s vitals are Normal: " +isPatientNormal(patientVitals));
    }
}