/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rishi
 */
public class Encounter extends VitalSigns {
    VitalSigns vitalSigns;
    
    String encounterDatetime;

    public Encounter() {
       // this.vitalSigns = new VitalSigns();
       super();
        this.encounterDatetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }

    public String getEncounterDatetime() {
        return encounterDatetime;
    }

    public void setEncounterDatetime(String encounterDatetime) {
        this.encounterDatetime = encounterDatetime;
    }
    
    public Encounter( int heartRate, float bp, int oxygenrate, int temp) {
       this.vitalSigns = new VitalSigns( heartRate, bp, oxygenrate,temp);
      //  this.heartRate=;
        //vitalSigns.heartrate=this.heartRate;
       // this.heartRate=vitalSigns.getHeartrate();
        
        this.encounterDatetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }
    
    
    
    
}



    