class OuterClass {
    String OuterClassData = "Outer Class Private data!!";

    class InnerClass {
        void accessOuterClassData() {
            System.out.printf("Outer class Data Exposed: ", OuterClassData);
        }
    }
}

public class Prog9 {
    public static void main() {
        
    }
}
