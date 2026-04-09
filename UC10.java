import java.util.ArrayList;
import java.util.List;

// This class is the "Manager" - it handles the data logic
class NameManager {
    private List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    public List<String> getAllNames() {
        return names;
    }
}

// This is your main "Runner" class
public class UC10 {
    public static void main(String[] args) {
        // We create an 'object' of our manager
        NameManager manager = new NameManager();

        // The manager does the work
        manager.addName("Alice");
        manager.addName("Bob");

        System.out.println("Names in manager: " + manager.getAllNames());
    }
}