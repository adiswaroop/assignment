public class Product {
    public static double VAT = 18.0;
    public static double discountRate = 10.0;

    public Product(double basePrice) {
        System.out.println("Final Calculated Price: "+ calculate(basePrice));
    };
    
    public Product(double  VAT, double discountRate, double basePrice) {
        Product.VAT = VAT;
        Product.discountRate = discountRate;
        System.out.println("Final Calculated Price: "+ calculate(basePrice));
    }

    public static double calculate(double basePrice) {
        return basePrice + basePrice*(Product.VAT/100.0) - basePrice*(Product.discountRate/100);
    }

    public static void main(String[] args) {
        Product _ = new Product(2000);
        Product _ = new Product(4000);
        Product _ = new Product(6000);
        Product _ = new Product(8000);
        Product _ = new Product(10000);
        Product _ = new Product(12000);
    }
}
