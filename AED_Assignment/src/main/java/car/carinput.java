/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

import javax.swing.ImageIcon;

/**
 *
 * @author rishi
 */
public class carinput {
    String Brand,Model,color,owner_name,email,owner_address,engine_no;
    double miles;
    //price of servicing the vehicle
    int pos;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    
    public String getOwner_mobno() {
        return owner_mobno;
    }

    public void setOwner_mobno(String owner_mobno) {
        this.owner_mobno = owner_mobno;
    }
    String service_date,owner_mobno;

    public String getService_date() {
        return service_date;
    }

    public void setService_date(String service_date) {
        this.service_date = service_date;
    }
    String licensce_no;
    int warranty_year,ssn,seats_no,owner_licensceno,year;
        ImageIcon img;

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
    public String getBrand() {
        return Brand;
    }

    public int getOwner_licensceno() {
        return owner_licensceno;
    }

    public void setOwner_licensceno(int owner_licensceno) {
        this.owner_licensceno = owner_licensceno;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public String getLicensce_no() {
        return licensce_no;
    }

    public void setLicensce_no(String licensce_no) {
        this.licensce_no = licensce_no;
    }

    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   

    public int getWarranty_year() {
        return warranty_year;
    }

    public void setWarranty_year(int warranty_year) {
        this.warranty_year = warranty_year;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getSeats_no() {
        return seats_no;
    }

    public void setSeats_no(int seats_no) {
        this.seats_no = seats_no;
    }

    public String getEngine_no() {
        return engine_no;
    }

    public void setEngine_no(String engine_no) {
        this.engine_no = engine_no;
    }
   
    
    
   public String toString(){
       //return "Brand: "+this.Brand +" Name: "+this.owner_name +" SSN: "+this.ssn+" Owner: "+this.email;         
        return this.engine_no;
    }
    
}
