/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author rishi
 */
public class Patient extends Person{
     Encounter encounter;
    EncounterHistory ehobj;
    Boolean isPatientNormal;
    VitalSigns vs;
    Person p;
    VitalSignDirectory vsd;
    PersonDirectory pd;
    PatientDirectory ptdirectory;
    
   public Patient(){
       // this.p = new Person();
      
        
    }
    
  public   Patient(PersonDirectory pd, VitalSignDirectory vsd, EncounterHistory ehobj) {
       this.pd=pd;
       this.vsd=vsd;
       this.ehobj=ehobj;
       //abnormalrecord();
       //Abnormalrecords(id);
        
    }
  
 

   
}
    

