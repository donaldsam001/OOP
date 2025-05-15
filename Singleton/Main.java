package Singleton;

public class Main {
    public static void f(){
        Singleton.getSingleton().setData("Hello");
    }

    public static void main(String[] args) {
//        Singleton s1 = Singleton.getSingleton();
//        Singleton s2 = Singleton.getSingleton();
//
//        System.out.println(s1 == s2);  // true (cùng một instance)

        f();
        System.out.println(Singleton.getSingleton().getData());
    }
}

class Singleton {
    // Biến static để lưu instance duy nhất
    private static Singleton instance;
    String data;


    // Constructor bị ẩn đi (private)
    private Singleton() {
        System.out.println("Singleton constructor called");
    }

    // Phương thức static để truy cập instance
    public static Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton(); // Tạo instance nếu chưa có
        }
        return instance;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return  this.data;
    }
}

