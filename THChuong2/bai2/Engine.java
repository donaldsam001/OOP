/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai2;

/**
 *
 * @author ADMIN
 */
public class Engine {
    String brand;
    float power;
    boolean status;

    public Engine() {
    }

    public Engine(String brand, float power, boolean status) {
        this.brand = brand;
        this.power = power;
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void start(){
        this.status=true;
    }
    
    public void Off(){
        this.status=false;
    }
    
}
