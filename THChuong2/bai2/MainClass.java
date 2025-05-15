/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai2;

/**
 *
 * @author ADMIN
 */
public class MainClass {
    public static void main(String[] args) {
        Seatbelt seatbelt = new Seatbelt("Vinfast", 160, false);
        Engine engine = new Engine( "Vinfast", 9999, false );
        Car car= new Car("VF9", "Vinfast", seatbelt, engine, false);

        car.wearSeatBelt();
        car.start();
        car.move();
        car.stop();
        car.getOut();
        System.out.println("end");
    }
    
}
