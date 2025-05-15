/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai1.accessory;

/**
 *
 * @author ADMIN
 */
public class Lamp {
    float height;
    String material;
    boolean status;

    public Lamp() {
    }

    public Lamp(float height, String material, boolean status) {
        this.height = height;
        this.material = material;
        this.status = status;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
