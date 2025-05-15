package HamTinh;

public class Count {
    public static void main(String[] args) {
        Counter c1 = new Counter();System.out.println(Counter.getCount());
        Counter c2 = new Counter();System.out.println(Counter.getCount());
    }
}

class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
    public static int getCount(){
        return count;
    }
}