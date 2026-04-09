import java.util.Scanner; // SPOT 1: The Import

public class UC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // SPOT 2: Capitalization
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Hello, " + name);

        sc.close(); // SPOT 3: The Close
    }
}