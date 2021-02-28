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
public class Patient extends Person {

    private PatientDirectory patientDirectory;
    private EncounterHistory encounterHistory;

    public String getName() {
        return super.getFullName();
    }

    public void setName(String name) {
        super.setFullName(name);
    }
    

    public Patient(String name) {
        super.setFullName(name);
         encounterHistory = new EncounterHistory();
       
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
        
    public Patient() {
        this.patientDirectory = new PatientDirectory();
    }
    
    public boolean isThisVitalSignNormal(String selectedVitalSignName) {
        for (Encounter encounter : this.encounterHistory.encounterHistory) {
            VitalSigns vsign = encounter.getVitalSigns();
            if (vsign.getIsIsRecent()) {
                return vsign.isThisVitalSignNormal(selectedVitalSignName);
            }
        }
        return false;
    }
    
    public void printVitalSignsHistory(){
        int i = 0;
        for(Encounter enc:this.encounterHistory.encounterHistory){
            VitalSigns vsign = enc.getVitalSigns();
            System.out.println("\nRecord " + (++i) + " : ");
            System.out.println("Timestamp: " + enc.getTimeStamp());
            System.out.println("Age: " + vsign.getAgeGroup());
            System.out.println("Respiratory Rate: " + vsign.getRespiratoryRate());
            System.out.println("Heart Rate: " + vsign.getHeartRate());
            System.out.println("Systolic Blood pressure: " + vsign.getBloodPressure());
            System.out.println("Weight In Kgs: " + vsign.getWeightInKilos());
            System.out.println("Weight In Pounds: " + vsign.getWeightinPounds());
        }
    }

}