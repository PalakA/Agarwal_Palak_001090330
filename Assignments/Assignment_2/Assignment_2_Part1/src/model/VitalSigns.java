/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author palak
 */

public class VitalSigns {
    
    private double patientAge;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double weightInKilos;
    private double weightinPounds;

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightinPounds() {
        return weightinPounds;
    }

    public void setWeightinPounds(double weightinPounds) {
        this.weightinPounds = weightinPounds;
    }

    public double getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(double patientAge) {
        this.patientAge = patientAge;
    }
    
}
