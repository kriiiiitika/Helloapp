import java.util.Scanner;

public class UC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (name.equals("exit")) break;
            System.out.println("Hello, " + name);
        }
        sc.close();
    }
}