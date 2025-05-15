package Singleton;

public class moRongSingleton {
    public static void main(String[] args) {
        MultiInstanceSingleton a = MultiInstanceSingleton.getInstance();
        MultiInstanceSingleton b = MultiInstanceSingleton.getInstance();
        MultiInstanceSingleton c = MultiInstanceSingleton.getInstance();
        MultiInstanceSingleton d = MultiInstanceSingleton.getInstance();  // Lặp lại từ a

        a.doSomething();
        b.doSomething();
        c.doSomething();
        d.doSomething();

        // Kiểm tra vòng lặp instance
        System.out.println(a == d);  // true (vì d == a)
    }
}

class MultiInstanceSingleton {
    // Số lượng instance cho phép
    private static final int MAX_INSTANCES = 3;

    // Mảng lưu các instance
    private static final MultiInstanceSingleton[] instances = new MultiInstanceSingleton[MAX_INSTANCES];

    // Đếm số lần truy cập để phân phối instance
    private static int index = 0;

    // Constructor private
    private MultiInstanceSingleton() {
        System.out.println("Instance created");
    }

    // Khởi tạo các instance một lần duy nhất
    static {
        for (int i = 0; i < MAX_INSTANCES; i++) {
            instances[i] = new MultiInstanceSingleton();
        }
    }

    // Trả về một instance theo vòng tròn (round-robin)
    public static MultiInstanceSingleton getInstance() {
        MultiInstanceSingleton instance = instances[index];
        index = (index + 1) % MAX_INSTANCES;
        return instance;
    }

    public void doSomething() {
        System.out.println("Using instance at index: " + ((index - 1 + MAX_INSTANCES) % MAX_INSTANCES));
    }
}
