import java.util.HashMap;
public class Books {
    public static void main(String[] args) {
        HashMap<String, Object> booksHashmap = new HashMap<>();
        booksHashmap.put("title", "The Great Gatsby");
        booksHashmap.put("author", "F. Scott Fitzgerald");
        booksHashmap.put("year", 1925);

        System.out.println("Title: " + booksHashmap.get("title") + ", Author: " + booksHashmap.get("author") + ", Year: " + booksHashmap.get("year"));
    }
}
