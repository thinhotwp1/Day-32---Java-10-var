import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Không nên dùng var như sau:
        // var x = process();      // 😵 process() trả về cái gì?
        // var map = new HashMap<>(); // ❌ suy luận thành HashMap<Object, Object>
        // var config = loadConfig(); // ❓ kiểu gì?
    }

    // Code Java 8
    public void processUserDataJava8() {
        List<String> userNames = List.of("Alice", "Bob", "Charlie");

        // 1. Refactor vòng lặp này
        for (String name : userNames) {
            System.out.println(name.toUpperCase());
        }

        // 2. Refactor biến này
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "Alice");

        // 3. Refactor biến này
        StringBuilder summary = new StringBuilder();
        summary.append("Done.");
    }
    // Viết lại 3 vị trí trên bằng 'var'

    // Code Java 10
    public void processUserDataJava10() {
        var userNames = List.of("Alice", "Bob", "Charlie");

        // 1. Refactor vòng lặp này
        for (var userName : userNames) {
            System.out.println(userName.toUpperCase());
        }

        // 2. Refactor biến này
        var userMap = new HashMap<Integer, String>();
        userMap.put(1, "Alice");

        // 3. Refactor biến này
        var summary = new StringBuilder();
        summary.append("Done.");
    }

}