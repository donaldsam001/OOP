/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai1;

import huce.cntt.oop.th1.bai1.accessory.Book;
import huce.cntt.oop.th1.bai1.accessory.Lamp;
import huce.cntt.oop.th1.bai1.accessory.Table;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class MainClass {
    public static void main(String[] args) {
        Book b1= new Book("Toan roi rac", "DHXD", 190, "13x17");
        Book b2= new Book("Giai tich 1", "DHXD", 180, "13x17");
        Book b3= new Book("Giai tich 2", "DHXD", 170, "13x17");
        Lamp lamp= new Lamp(40, "Classic", false);
        
        ArrayList<Book> books= new ArrayList();
        books.add(b1);
        books.add(b2);
        Table table= new Table(80, 60,50,"Wood", books, lamp);
        table.addBook(b3);
        table.switchLamp();
        table.display();
        System.out.println("Lamp on table: "+ table.getLamp().isStatus());
        
    }
}
