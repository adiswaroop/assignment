class Parent {
    Parent() {
        System.out.println("Parent constructor executed!!");
    }

    void display() {
        System.out.println("Parent display method executed!!");
    }
}

class Child extends Parent{
    Child() {
        super();
        System.out.println("Child constructor executed!!");
    }

    @Override 
    void display() {
        System.out.println("Child display method executed!!");
    }

    void action() {
        super.display();
        this.display();
    }
}

public class Prog7 {
    public static void main(String[] args) {
        Child c = new Child();
        c.action();
    }
}
