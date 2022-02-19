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
public class Carhistory {
    ArrayList <Car> obj;
    
    public Carhistory(){
        obj=new ArrayList<Car>();
    }

    public ArrayList<Car> getObj() {
        return obj;
    }

    public void setObj(ArrayList<Car> obj) {
        this.obj = obj;
    }
     public Car addnew(Car newcar){
//        carinput newdata= new carinput();
        obj.add(newcar);
        return newcar;
    
}
     
}
