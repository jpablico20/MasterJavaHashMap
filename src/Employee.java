import java.util.HashMap;

public class Employee {
    public static void main(String[] args) {
        HashMap<String, Object> employeeHashmap = new HashMap<>();
        employeeHashmap.put("name", "John Doe");
        employeeHashmap.put("department", "Sales");
        employeeHashmap.put("age", 30);

        System.out.println("Employee Name: " + employeeHashmap.get("name") + ", Department: " + employeeHashmap.get("department") + ", Age: " + employeeHashmap.get("age"));
    }
}
