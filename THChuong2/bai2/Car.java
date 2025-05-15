/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai2;

/**
 *
 * @author ADMIN
 */
public class Car {
    String type;
    String brand;
    Seatbelt seatbelt;
    Engine engine;
    boolean status;

    public Car() {
        Seatbelt seatbelt= new Seatbelt();
        Engine engine = new Engine();
    }

    public Car(String type, String brand, Seatbelt seatbelt, Engine engine, boolean status) {
        this.type = type;
        this.brand = brand;
        this.seatbelt = seatbelt;
        this.engine = engine;
        this.status = status;
    }
    
    public void wearSeatBelt(){
        if (!this.seatbelt.status){
            this.seatbelt.switchOnOff();
        }
    }
    
    public void start(){
        if (this.seatbelt.status){
            this.engine.start();
        }
    }
    
    public void move(){
        if (this.engine.status){
            System.out.println("Running");
        }
    }
    
    public void stop(){
        this.engine.Off();
        this.status=false;
    }
    
    public void getOut(){
        if (this.seatbelt.status){
            this.seatbelt.switchOnOff();
        }
        if (this.engine.status){
            System.out.println("Please turn off the engine!");
        }
    }
}
