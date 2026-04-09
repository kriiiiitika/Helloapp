import java.util.*;

public class UC8 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob"));
        names.remove("Alice");
        System.out.println("Remaining names: " + names);
    }
}