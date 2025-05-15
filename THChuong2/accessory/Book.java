/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.cntt.oop.th1.bai1.accessory;

/**
 *
 * @author ADMIN
 */
public class Book {
    String name;
    String author;
    int pageNumbers;
    String size;

    public Book() {
    }

    public Book(String name, String author, int pageNumbers, String size) {
        this.name = name;
        this.author = author;
        this.pageNumbers = pageNumbers;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void display(Book b){
        System.out.println(b.getName()+": "+ b.getAuthor()+" " +b.getPageNumbers()+" "+ b.getSize());
    }
}
