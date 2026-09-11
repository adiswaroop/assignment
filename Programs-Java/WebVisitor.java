public class WebVisitor {
    
    static int visitorCount = 0;

    public WebVisitor() {
        visitorCount++;
        System.out.println("Total Visitors: " + visitorCount);
    }

    public static void main(String[] args) {
        System.out.println("Current count: " + visitorCount);
        WebVisitor _ = new WebVisitor();
        WebVisitor _ = new WebVisitor();
        WebVisitor _ = new WebVisitor();
        WebVisitor _ = new WebVisitor();
        WebVisitor _ = new WebVisitor();
    }
    
}
