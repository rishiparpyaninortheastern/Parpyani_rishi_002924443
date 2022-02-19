/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rishi
 */
public class Car {
    String brand,model;
    int seats;
    String year;
    int sno;
    boolean maintainence,available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public boolean isMaintainence() {
        return maintainence;
    }

    public void setMaintainence(boolean maintainence) {
        this.maintainence = maintainence;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", seats=" + seats + ", sno=" + sno + ", maintainence=" + maintainence + ", location=" + location + '}';
    }
    
    
}
