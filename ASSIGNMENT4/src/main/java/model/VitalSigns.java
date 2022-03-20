/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rishi
 */
public class VitalSigns  {
    int heartrate,fastingsugar,postmealsugar,oxygenlevel;
    float temperature,bloodpressure;
    int idselected;
    
    public VitalSigns(){

    }

    public int getIdselected() {
        return idselected;
    }

    public void setIdselected(int idselected) {
        this.idselected = idselected;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public int getFastingsugar() {
        return fastingsugar;
    }

    public void setFastingsugar(int fastingsugar) {
        this.fastingsugar = fastingsugar;
    }

    public int getPostmealsugar() {
        return postmealsugar;
    }

    public void setPostmealsugar(int postmealsugar) {
        this.postmealsugar = postmealsugar;
    }

    public int getOxygenlevel() {
        return oxygenlevel;
    }

    public void setOxygenlevel(int oxygenlevel) {
        this.oxygenlevel = oxygenlevel;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(float bloodpressure) {
        this.bloodpressure = bloodpressure;
    }
    
    public VitalSigns(int heartRate, float bp, int oxygenrate, int temp) {
        this.heartrate=heartRate;
        this.bloodpressure=bp;
        this.oxygenlevel=oxygenrate;
        this.temperature=temp;

//, double weightInPounds){
   //this.respiratoryRate = respiratoryRate;
//        this.heartRate = heartRate;
//        this.systolicBP = systolicBP;
//        this.weightInKilos = weightInKilos;
//        this.weightInPounds = weightInKilos * 2.20462262;
//        this.vitalSignDatetime = LocalDateTime.now();
        this.updateVitalSigns(heartRate, bp, oxygenrate, temp);
        
    }
    public void updateVitalSigns(int heartRate, float bp, int oxygenrate, int temp){
        this.heartrate=heartRate;
        this.bloodpressure=bp;
        this.oxygenlevel=oxygenrate;
        this.temperature=temp;
    }

 
    
}
