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
public class PersonDirectory {
     ArrayList <Person> obj=new ArrayList<Person>();;
     public PersonDirectory(){
        //obj
    }

    public ArrayList<Person> getObj() {
        System.out.println("PersonDirectory: "+obj);
        System.out.println("PersonDirectory Size: "+obj.size());
        return obj;
    }

    public void setObj(ArrayList<Person> obj) {
        this.obj = obj;
    }
     public Person addnew(Person p){
         
        obj.add(p);
        return p;
    
}
     public String toString(){
        String returnString = new String();
        int i = 0;
        for (Person person: obj){
            returnString += person + "\n";
            i++;
        }
        
        return returnString;
    }
    
}
