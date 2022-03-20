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
public class EncounterHistory extends Patient {
    ArrayList <Encounter> eobj;
   HashMap <Integer,ArrayList<Encounter>> obj;
    public EncounterHistory(){
        //obj
        eobj= new ArrayList <Encounter>();
        obj= new HashMap <Integer,ArrayList<Encounter>>();
    }

    public HashMap<Integer,ArrayList<Encounter>> getObj() {
        System.out.println("Encounter: "+obj);
        System.out.println("EncounterDirectory Size: "+obj.size());
       return obj;
    }

    public void setObj(HashMap <Integer,ArrayList<Encounter>> obj) {
        this.obj = obj;
    }
     public Encounter addnew(int Person,Encounter e){
        // Encounter encounter = new Encounter();
//        obj.put(Person,e);

       ArrayList<Encounter> ec = obj.get(Person);
       
       if(ec != null) {
           ec.add(e);
       }
       else {
           ec = new ArrayList<Encounter>();
           ec.add(e);
       }
       
         System.out.println(ec+ "size: "+ ec.size());
       
       obj.put(Person, ec);
       
        return e;
    
}
//     public String toString(){
//        String returnString = new String();
//        int i = 0;
//        for (Encounter encounter: obj){
//            returnString += encounter + "\n";
//            i++;
//        }
//        
//        return returnString;
//    } 
}
