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
public class VitalSigns {

    private int age;
    private double respiratoryRate;
    private double heartRate;
    private double bloodPressure;
    private double weightKg;
    private double weightInPounds;
    private boolean isRecent;

    public boolean getIsRecent() {
        return isRecent;
    }

    public void setIsRecent(boolean isRecent) {
        this.isRecent = isRecent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public boolean isThisVitalSignNormal(String selectedVialSignName) {
       
        switch (selectedVialSignName) {

            case "RespiratoryRate":
                return isRespiratoryRateNormal();           

            case "HeartRate":
                return isHeartRateNormal();

            case "BloodPressure":
                return isBloodPressureNormal();

            case "WeightInKgs":
                return isWeightInKgsNormal();

            case "WeightInLbs":
                return isWeightInLbsNormal();
        }
        return false;
    }

    public boolean isRespiratoryRateNormal() {
        int age = this.getAge();        
        double respiratoryRate = this.getRespiratoryRate();
        
        if (age == 0) {
            if (respiratoryRate >= 30 && respiratoryRate <= 50) {
                System.out.println("Respiratory Rate : " +  respiratoryRate);
                return true;
            } else {
                return false;
            }
        } else if (age == 1) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("Respiratory Rate : " +  respiratoryRate);
                return true;
            }
            System.out.println("Respiratory Rate : " +  respiratoryRate);
            return false;
        } else if (age > 1 && age <= 3) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("Respiratory Rate : " +  respiratoryRate);
                return true;
            } else {
                System.out.println("Respiratory Rate : " +  respiratoryRate);
            }
            return false;
        } else if (age > 3 && age <= 5) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("Respiratory Rate : " +  respiratoryRate);
                return true;
            }
            System.out.println("Respiratory Rate : " +  respiratoryRate);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                System.out.println("Respiratory Rate : " +  respiratoryRate);
                return true;
            }
            System.out.println("Respiratory Rate : " +  respiratoryRate);
            return false;
        } else {
            if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                System.out.println("Respiratory Rate : " +  respiratoryRate);
                return true;
            }
            System.out.println("Respiratory Rate : " +  respiratoryRate);
            return false;
        }
    }

    public boolean isHeartRateNormal() {
        int age = this.getAge();
        double heartRate = this.getHeartRate();

        if (age == 0) {
            if (heartRate >= 120 && heartRate <= 160) {
                System.out.println("Heart Rate : " + heartRate);
                return true;
            }
            System.out.println("Heart Rate : " + heartRate);
            return false;
        } else if (age == 1) {
            if (heartRate >= 80 && heartRate <= 140) {
                System.out.println("Heart Rate : " + heartRate);
                return true;
            }
            System.out.println("Heart Rate : " +  heartRate);
            return false;
        } else if (age > 1 && age <= 3) {
            if (heartRate >= 80 && heartRate <= 130) {
                System.out.println("Heart Rate : " +  heartRate);
                return true;
            }
            System.out.println("Heart Rate : " +  heartRate);
            return false;
        } else if (age > 3 && age <= 5) {
            if (heartRate >= 80 && heartRate <= 120) {
                System.out.println("Heart Rate : " +  heartRate);
                return true;
            }
            System.out.println("Heart Rate : " +  heartRate);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (heartRate >= 70 && heartRate <= 110) {
                System.out.println("Heart Rate : " +  heartRate);
                return true;
            }
            System.out.println("Heart Rate : " +  heartRate);
            return false;
        } else {
            if (heartRate >= 55 && heartRate <= 105) {
                System.out.println("Heart Rate : " +  heartRate);
                return true;
            }
            System.out.println("Heart Rate : " +  heartRate);
            return false;
        }
    }

    public boolean isBloodPressureNormal() {
        int age = this.getAge();
        double bloodPressure = this.getBloodPressure();

        if (age == 0) {
            if (bloodPressure >= 50 && bloodPressure <= 70) {
                System.out.println("Blood Pressure : " + bloodPressure);
                return true;
            }
            System.out.println("Blood Pressure : " + bloodPressure);
            return false;
        } else if (age == 1) {
            if (bloodPressure >= 70 && bloodPressure <= 100) {
                System.out.println("Blood Pressure : " + bloodPressure);
                return true;
            }
            System.out.println("Blood Pressure : " + bloodPressure);
            return false;
        } else if (age > 1 && age <= 3) {
            if (bloodPressure >= 80 && bloodPressure <= 110) {
                System.out.println("Blood Pressure : " + bloodPressure);
                return true;
            }
            System.out.println("Blood Pressure : " + bloodPressure);
            return false;
        } else if (age > 3 && age <= 5) {
            if (bloodPressure >= 80 && bloodPressure <= 110) {
                System.out.println("Blood Pressure : " + bloodPressure);
                return true;
            }
            System.out.println("Blood Pressure : " + bloodPressure);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (bloodPressure >= 80 && bloodPressure <= 120) {
                System.out.println("Blood Pressure : " + bloodPressure);
                return true;
            }
            System.out.println("Blood Pressure : " + bloodPressure);
            return false;
        } else {
            if (bloodPressure >= 110 && bloodPressure <= 120) {
                System.out.println("Blood Pressure : " + bloodPressure);
                return true;
            }
            System.out.println("Blood Pressure : " + bloodPressure);
            return false;
        }
    }

    public boolean isWeightInKgsNormal() {
        int age = this.getAge();
        double weightInKgs = this.getWeightKg();

        if (age == 0) {
            if (weightInKgs >= 2 && weightInKgs <= 3) {
                System.out.println("Weight in Kgs : " + weightInKgs);
                return true;
            }
            System.out.println("Weight in Kgs : " + weightInKgs);
            return false;
        } else if (age == 1) {
            if (weightInKgs >= 4 && weightInKgs <= 10) {
                System.out.println("Weight in Kgs : " + weightInKgs);
                return true;
            }
            System.out.println("Weight in Kgs : " + weightInKgs);
            return false;
        } else if (age > 1 && age <= 3) {
            if (weightInKgs >= 10 && weightInKgs <= 14) {
                System.out.println("Weight in Kgs : " + weightInKgs);
                return true;
            }
            System.out.println("Weight in Kgs : " + weightInKgs);
            return false;
        } else if (age > 3 && age <= 5) {
            if (weightInKgs >= 14 && weightInKgs <= 18) {
                System.out.println("Weight in Kgs : " + weightInKgs);
                return true;
            }
            System.out.println("Weight in Kgs : " + weightInKgs);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (weightInKgs >= 20 && weightInKgs <= 42) {
                System.out.println("Weight in Kgs : " + weightInKgs);
                return true;
            }
            System.out.println("Weight in Kgs : " + weightInKgs);
            return false;
        } else {
            if (weightInKgs > 50) {
                System.out.println("Weight in Kgs : " + weightInKgs);
                return true;
            }
            System.out.println("Weight in Kgs : " + weightInKgs);
            return false;
        }
    }

    public boolean isWeightInLbsNormal() {
        int age = this.getAge();
        double weightInPounds = this.getWeightInPounds();

        if (age == 0) {
            if (weightInPounds >= 4.5 && weightInPounds <= 7) {
                System.out.println("Weight in Pounds : " + weightInPounds);
                return true;
            }
            System.out.println("Weight in Pounds : " + weightInPounds);
            return false;
        } else if (age == 1) {
            if (weightInPounds >= 9 && weightInPounds <= 22) {
                System.out.println("Weight in Pounds : " + weightInPounds);
                return true;
            }
            System.out.println("Weight in Pounds : " + weightInPounds);
            return false;
        } else if (age > 1 && age <= 3) {
            if (weightInPounds >= 22 && weightInPounds <= 31) {
                System.out.println("Weight in Pounds : " + weightInPounds);
                return true;
            }
            System.out.println("Weight in Pounds : " + weightInPounds);
            return false;
        } else if (age > 3 && age <= 5) {
            if (weightInPounds >= 31 && weightInPounds <= 40) {
                System.out.println("Weight in Pounds : " + weightInPounds);
                return true;
            }
            System.out.println("Weight in Pounds : " + weightInPounds);
            return false;
        } else if (age >= 6 && age <= 12) {
            if (weightInPounds >= 41 && weightInPounds <= 92) {
                System.out.println("Weight in Pounds : " + weightInPounds);
                return true;
            }
            System.out.println("Weight in Pounds : " + weightInPounds);
            return false;
        } else {
            if (weightInPounds > 110) {
                System.out.println("Weight in Pounds : " + weightInPounds);
                return true;
            }
            System.out.println("Weight in Pounds : " + weightInPounds);
            return false;
        }
    }
}
     
     

    


    
    
    

