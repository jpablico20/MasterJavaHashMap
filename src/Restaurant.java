import java.util.HashMap;

public class Restaurant {
    public static void main(String[] args) {
        HashMap<String, Object> restaurantHashmap = new HashMap<>();
        restaurantHashmap.put("name", "Vikings Luxury Buffet");
        restaurantHashmap.put("location", "Pasay City");
        restaurantHashmap.put("year", 2011);

        System.out.println("Restaurant name: " + restaurantHashmap.get("name") + ", Location: " + restaurantHashmap.get("location") + ", Year: " + restaurantHashmap.get("year"));
    }
}
