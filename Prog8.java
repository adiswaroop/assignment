class Building {
    int width;
    int height;

    Building() {
        this.width = 10;
        this.height = 10;
    }

    Building(int width) {
        this.width = width;
        this.height = 10;
    }

    Building(int width, int height) {
        this.width = height;
        this.height = height;
    }
}

class House extends Building{
    House(){
        super(); 
        System.out.printf("Width of the house: %d and Height of the house: %d\n", this.width, this.height);
    }

    House(int width) {
        super(width);
        System.out.printf("Width of the house: %d and Height of the house: %d\n", this.width, this.height);
    }

    House(int width, int height) {
        super(width, height);
        System.out.printf("Width of the house: %d and Height of the house: %d\n", this.width, this.height);
    }
}

public class Prog8 {
    public static void main(String[] args) {
        House _ = new House();
        House _ = new House(20);
        House _ = new House(20, 20);
    }
}
