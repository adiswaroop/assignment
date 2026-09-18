public class Chain {
    public Chain step1() {
        System.out.println("Step 1 completed!!!");
        return this;
    }

    public Chain step2() {
        System.out.println("Step 2 completed!!!");
        return this;
    }

    public Chain step3() {
        System.out.println("Step 3 completed!!!");
        return this;
    }

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.step1().step2().step3();
    }
    
}
