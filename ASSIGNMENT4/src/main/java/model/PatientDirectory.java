/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rishi
 */
public class PatientDirectory {
    ArrayList <Person> obj=new ArrayList<Person>();;
     public PatientDirectory(){
        //obj
    }

    public ArrayList<Person> getObj() {
        System.out.println("PatientDirectory: "+obj);
        System.out.println("PatientDirectory Size: "+obj.size());
        return obj;
    }

    public void setObj(ArrayList<Person> obj) {
        this.obj = obj;
    }
     public Person addnew(Person patient){
         
        
              obj.add(patient);
         
                 
       
        return patient;
    
}
//     public String toString(){
//        String returnString = new String();
//        int i = 0;
//        for (Patient patient: obj){
//            returnString += patient + "\n";
//            i++;
//        }
//        
//         return returnString;
//}

}