public class Order {
    static int totalOrders;

    static {
        totalOrders = 0;
    }

    public static void increment() {
        totalOrders++;
    }

    public static void display() {
        System.out.println("Current Orders Count: " + totalOrders);
    }

    public Order() {
        increment();
        display();
    }

    public static void main(String[] args) {
        Order _ = new Order();
        Order _ = new Order();
        Order _ = new Order();
        Order _ = new Order();
        Order _ = new Order();
        Order _ = new Order();
    }    
}
