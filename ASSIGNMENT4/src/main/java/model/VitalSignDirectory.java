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
public class VitalSignDirectory {
    HashMap <Integer,ArrayList <VitalSigns>> obj=new HashMap<Integer,ArrayList <VitalSigns>>();
     public VitalSignDirectory(){
        //obj
    }

    public HashMap<Integer,ArrayList<VitalSigns>> getObj() {
        System.out.println("Vital sign Directory: "+obj);
        System.out.println("Vital sign Directory Size Size: "+obj.size());
        return obj;
    }

    public void setObj(HashMap<Integer,ArrayList<VitalSigns>> obj) {
        this.obj = obj;
    }
    public  VitalSigns addnew(int Person,VitalSigns v){
         //VitalSigns vs = new VitalSigns();
//        obj.put(Person,v);
//        return  v;
         ArrayList<VitalSigns> vs = obj.get(Person);
       
       if(vs != null) {
           vs.add(v);
       }
       else {
           vs = new ArrayList<VitalSigns>();
           vs.add(v);
       }
       
         System.out.println(vs+ "size: "+ vs.size());
       
       obj.put(Person, vs);
       
        return v;
    
}
     

    
}
