class Vechile {
    void move() {
        System.out.println("Move from the vechile!!!");
    }
}

class Car extends Vechile {
    void move() {
        super.move();
        System.out.println("Move from the Car!!!");
    }
}

public class Prog6 {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
    }
}
