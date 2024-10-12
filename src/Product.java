import java.util.HashMap;

public class Product {
    public static void main(String[] args) {
        HashMap<String, Object> productHashMap = new HashMap<>();
        productHashMap.put("name", "Laptop");
        productHashMap.put("category", "Electronics");
        productHashMap.put("price", 750);

        System.out.println("Product Name: " + productHashMap.get("name") + ", Category: " + productHashMap.get("category") + ", Price: " + productHashMap.get("price"));
    }
}
