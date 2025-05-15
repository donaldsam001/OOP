package Ex;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class C4Ex3 {
    public static void main(String[] args) {
        Bookshelf<Book> bookshelf= new Bookshelf<>();
        Book b1 = new Book();
        b1.title = "java";
        b1.author = "Duck";

        Book b2= new Book();
        b2.title = "Python";
        b2.author = "Snake";

        bookshelf.putItems(b1);
        bookshelf.putItems(b2);

        Document foundBook = bookshelf.getItemByTitle("java");
        if (foundBook != null){
            foundBook.print();
        }
        else{
            System.out.println("Error");
        }
    }
}

abstract class Document{
    String title;
    int pages;
    String size;
    public abstract void print();

}

class Book extends Document{
    String author;

    @Override
    public void print(){
        System.out.println("Book");
    }
}

class Magazine extends Document{
    String publisher;

    @Override
    public void print(){
        System.out.println("Magazine");
    }
}

class Bookshelf<T extends Document> {
    List<T> items;

    public Bookshelf(){
        items = new ArrayList<T>();
    }

    public void putItems(T t){
        //TODO: thêm đối tượng t và danh sách items
        this.items.add(t);
    }

    public T getItemByTitle(String title){
        for (T item : this.items){
            if (item.title != null && item.title.equals(title)){
                return item;
            }
        }
        return null;
    }
}