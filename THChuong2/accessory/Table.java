/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai1.accessory;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Table {
    float lenght;
    float width;
    float height;
    String material;
    ArrayList<Book> books;
    Lamp lamp;

    public Table() {
        ArrayList<Book> books = new ArrayList();
        Lamp lamp =new Lamp();
    }

    public Table(float lenght, float width, float height, String material, ArrayList<Book> books, Lamp lamp) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.material = material;
        this.books = books;
        this.lamp = lamp;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public void addBook(Book b){
        this.books.add(b);
    }
    
    public void display(){
        for (Book b : this.books ){
            b.display(b);
        }
    }
 
    public void switchLamp(){
        lamp.switchOnOff();
    }
    
}
