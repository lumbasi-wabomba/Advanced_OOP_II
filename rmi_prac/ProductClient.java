import java.rmi.*;

public class ProductClient{
    public static void main(String[] args) {
        String url = "rmi://localhost/";

        try {
            Product p1 = (Product) Naming.lookup(url + "Product1");
            Product p2 = (Product) Naming.lookup(url + "Product2");
            System.out.println("Product 1: " + p1.getName() + " - Price: " + p1.getPrice());
            System.out.println("Product 2: " + p2.getName() + " - Price: " + p2.getPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}