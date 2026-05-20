public class ProductServer {
    public static void main(String[] args) {
        try {
            // Create product instances
            Product p1 = new ProductImpl("Laptop", 999.99);
            Product p2 = new ProductImpl("Smartphone", 499.99);

            // Bind products to RMI registry
            java.rmi.Naming.rebind("Product1", p1);
            java.rmi.Naming.rebind("Product2", p2);
            System.out.println("Products are ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
