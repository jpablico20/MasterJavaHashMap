import java.util.HashMap;

public class University {
    public static void main(String[] args) {
        HashMap<String, Object> universityHashmap = new HashMap<>();
        universityHashmap.put("name", "University of the Philippines");
        universityHashmap.put("location", "Quezon City");
        universityHashmap.put("year", 1908);

        System.out.println("School name: " + universityHashmap.get("name") + ", Location: " + universityHashmap.get("location") + ", Year: " + universityHashmap.get("year"));
    }
}
