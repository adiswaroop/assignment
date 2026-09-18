public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.printf("Width of the rectangle: %d and Height of the rectangle: %d\n", this.width, this.height);
    }

    public Rectangle(int width) {
        this(width, 20);
        System.out.printf("Default height of the rectangle is set to: %d\n", this.height);
    }

    public static void main(String[] args) {
        Rectangle _ = new Rectangle(25, 25);
        Rectangle _ = new Rectangle(25);
    }
}
