/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author palak
 */
public class VitalSigns {
    
    private double ageGroup;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double weightInKilos;
    private double weightinPounds;
    private String date;
    private  boolean isRecent;

    public double getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(double ageGroup) {
        this.ageGroup = ageGroup;
    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString(){
        return date;
    }

    public boolean getIsIsRecent() {
        return isRecent;
    }

    public void setIsRecent(boolean isRecent) {
        this.isRecent = isRecent;
    }
 
        public boolean isThisVitalSignNormal(String selectedVialSign) {
       
        switch (selectedVialSign) {

            case "RespiratoryRate":
                return isRespiratoryRateNormal();           

            case "HeartRate":
                return isHeartRateNormal();

            case "BloodPressure":
                return isBloodPressureNormal();

            case "WeightInKgs":
                return isWeightInKgsNormal();

            case "WeightInPounds":
                return isWeightInLbsNormal();
        }

        return false;
    }
    
    private boolean isRespiratoryRateNormal() {
        double age = this.getAgeGroup();        
        double respiratoryVitalRate = this.getRespiratoryRate();
        
        if (age == 0) {
            if (respiratoryVitalRate >= 30 && respiratoryVitalRate <= 50) {
                System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
                return true;
            } else {
                return false;
            }
        } else if (age > 0 && age <=1) {
            if (respiratoryVitalRate >= 20 && respiratoryVitalRate <= 30) {
                System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
                return true;
            }
            System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
            return false;
        } else if (age > 1 && age <= 3) {
            if (respiratoryVitalRate >= 20 && respiratoryVitalRate <= 30) {
                System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
                return true;
            } else {
                System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
            }
            return false;
        } else if (age > 3 && age <= 5) {
            if (respiratoryVitalRate >= 20 && respiratoryVitalRate <= 30) {
                System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
                return true;
            }
            System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (respiratoryVitalRate >= 20 && respiratoryVitalRate <= 30) {
                System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
                return true;
            }
            System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
            return false;
        } else {
            if (respiratoryVitalRate >= 12 && respiratoryVitalRate <= 20) {
                System.out.println("Respiratory Rate was : " +  respiratoryVitalRate);
                return true;
            }
            System.out.println("Respiratory Rate was  : " +  respiratoryVitalRate);
            return false;
        }

    }

    private boolean isHeartRateNormal() {
        double age = this.getAgeGroup();
        double heartVitalRate = this.getHeartRate();

        if (age == 0) {
            if (heartVitalRate >= 120 && heartVitalRate <= 160) {
                System.out.println("Heart Rate was : " + heartVitalRate);
                return true;
            }
            System.out.println("Heart Rate was : " + heartVitalRate);
            return false;
        } else if (age > 0 && age <=1) {
            if (heartVitalRate >= 80 && heartVitalRate <= 140) {
                System.out.println("Heart Rate was : " + heartVitalRate);
                return true;
            }
            System.out.println("Heart Rate was : " +  heartVitalRate);
            return false;
        } else if (age > 1 && age <= 3) {
            if (heartVitalRate >= 80 && heartVitalRate <= 130) {
                System.out.println("Heart Rate was : " +  heartVitalRate);
                return true;
            }
            System.out.println("Heart Rate was : " +  heartVitalRate);
            return false;
        } else if (age > 3 && age <= 5) {
            if (heartVitalRate >= 80 && heartVitalRate <= 120) {
                System.out.println("Heart Rate was : " +  heartVitalRate);
                return true;
            }
            System.out.println("Heart Rate was : " +  heartVitalRate);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (heartVitalRate >= 70 && heartVitalRate <= 110) {
                System.out.println("Heart Rate was : " +  heartVitalRate);
                return true;
            }
            System.out.println("Heart Rate was : " +  heartVitalRate);
            return false;
        } else {
            if (heartVitalRate >= 55 && heartVitalRate <= 105) {
                System.out.println("Heart Rate was : " +  heartVitalRate);
                return true;
            }
            System.out.println("Heart Rate was : " +  heartVitalRate);
            return false;
        }
    }

    private boolean isBloodPressureNormal() {
        double age = this.getAgeGroup();
        double bloodPressureVitals = this.getBloodPressure();

        if (age == 0) {
            if (bloodPressureVitals >= 50 && bloodPressureVitals <= 70) {
                System.out.println("Blood Pressure was : " + bloodPressureVitals);
                return true;
            }
            System.out.println("Blood Pressure was : " + bloodPressureVitals);
            return false;
        } else if (age > 0 && age <=1) {
            if (bloodPressureVitals >= 70 && bloodPressureVitals <= 100) {
                System.out.println("Blood Pressure was : " + bloodPressureVitals);
                return true;
            }
            System.out.println("Blood Pressure was : " + bloodPressureVitals);
            return false;
        } else if (age > 1 && age <= 3) {
            if (bloodPressureVitals >= 80 && bloodPressureVitals <= 110) {
                System.out.println("Blood Pressure was : " + bloodPressureVitals);
                return true;
            }
            System.out.println("Blood Pressure was : " + bloodPressureVitals);
            return false;
        } else if (age > 3 && age <= 5) {
            if (bloodPressureVitals >= 80 && bloodPressureVitals <= 110) {
                System.out.println("Systolic Blood Pressure was : " + bloodPressureVitals);
                return true;
            }
            System.out.println("Blood Pressure was : " + bloodPressureVitals);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (bloodPressureVitals >= 80 && bloodPressureVitals <= 120) {
                System.out.println("Blood Pressure was : " + bloodPressureVitals);
                return true;
            }
            System.out.println("Blood Pressure was : " + bloodPressureVitals);
            return false;
        } else {
            if (bloodPressureVitals >= 110 && bloodPressureVitals <= 120) {
                System.out.println("Blood Pressure was : " + bloodPressureVitals);
                return true;
            }
            System.out.println("Blood Pressure was : " + bloodPressureVitals);
            return false;
        }
    }

    private boolean isWeightInKgsNormal() {
        double age = this.getAgeGroup();
        double weightVitalsInKgs = this.getWeightInKilos();

        if (age == 0) {
            if (weightVitalsInKgs >= 2 && weightVitalsInKgs <= 3) {
                System.out.println("Weight in Kg was : " + weightVitalsInKgs);
                return true;
            }
            System.out.println("Weight in Kg was : " + weightVitalsInKgs);
            return false;
        } else if (age > 0 && age <=1) {
            if (weightVitalsInKgs >= 4 && weightVitalsInKgs <= 10) {
                System.out.println("Weight in Kg was : " + weightVitalsInKgs);
                return true;
            }
            System.out.println("Weight in Kg was : " + weightVitalsInKgs);
            return false;
        } else if (age > 1 && age <= 3) {
            if (weightVitalsInKgs >= 10 && weightVitalsInKgs <= 14) {
                System.out.println("Weight in Kg was : " + weightVitalsInKgs);
                return true;
            }
            System.out.println("Weight in Kg was : " + weightVitalsInKgs);
            return false;
        } else if (age > 3 && age <= 5) {
            if (weightVitalsInKgs >= 14 && weightVitalsInKgs <= 18) {
                System.out.println("Weight in Kg was : " + weightVitalsInKgs);
                return true;
            }
            System.out.println("Weight in Kg was : " + weightVitalsInKgs);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (weightVitalsInKgs >= 20 && weightVitalsInKgs <= 42) {
                System.out.println("Weight in Kg was : " + weightVitalsInKgs);
                return true;
            }
            System.out.println("Weight in Kg was : " + weightVitalsInKgs);
            return false;
        } else {
            if (weightVitalsInKgs > 50) {
                System.out.println("Weight in Kg was : " + weightVitalsInKgs);
                return true;
            }
            System.out.println("Weight in Kg was : " + weightVitalsInKgs);
            return false;
        }
    }

    private boolean isWeightInLbsNormal() {
        double age = this.getAgeGroup();
        double weightVitalsInPounds = this.getWeightinPounds();

        if (age == 0) {
            if (weightVitalsInPounds >= 4.5 && weightVitalsInPounds <= 7) {
                System.out.println("Weight in Pd was : " + weightVitalsInPounds);
                return true;
            }
            System.out.println("Weight in Pd was : " + weightVitalsInPounds);
            return false;
        } else if (age > 0 && age <=1) {
            if (weightVitalsInPounds >= 9 && weightVitalsInPounds <= 22) {
                System.out.println("Weight in Pd was : " + weightVitalsInPounds);
                return true;
            }
            System.out.println("Weight in Pd was : " + weightVitalsInPounds);
            return false;
        } else if (age > 1 && age <= 3) {
            if (weightVitalsInPounds >= 22 && weightVitalsInPounds <= 31) {
                System.out.println("Weight in Pd was : " + weightVitalsInPounds);
                return true;
            }
            System.out.println("Weight in Pd was : " + weightVitalsInPounds);
            return false;
        } else if (age > 3 && age <= 5) {
            if (weightVitalsInPounds >= 31 && weightVitalsInPounds <= 40) {
                System.out.println("Weight in Pd was : " + weightVitalsInPounds);
                return true;
            }
            System.out.println("Weight in Pd was : " + weightVitalsInPounds);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (weightVitalsInPounds >= 41 && weightVitalsInPounds <= 92) {
                System.out.println("Weight in Pd was : " + weightVitalsInPounds);
                return true;
            }
            System.out.println("Weight in Pd was : " + weightVitalsInPounds);
            return false;
        } else {
            if (weightVitalsInPounds > 110) {
                System.out.println("Weight in Pd was : " + weightVitalsInPounds);
                return true;
            }
            System.out.println("Weight in Pd was : " + weightVitalsInPounds);
            return false;
        }
    }
}

