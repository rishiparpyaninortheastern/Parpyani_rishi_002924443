/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rishi
 */
public class House extends Community {
    String Housenum;

    public String getHousenum() {
        return Housenum;
    }

    public void setHousenum(String Housenum) {
        this.Housenum = Housenum;
    }
    
    public String toString(){
        
        return "housenum/n"+this.Housenum;
    }
}
