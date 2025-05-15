/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai2;

/**
 *
 * @author ADMIN
 */
public class Seatbelt {
    String brand;
    float length;
    boolean status;

    public Seatbelt() {
    }

    public Seatbelt(String brand, float length, boolean status) {
        this.brand = brand;
        this.length = length;
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void switchOnOff(){
        this.status=!this.status;
    }
    
}
