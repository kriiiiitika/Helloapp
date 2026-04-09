import java.io.*;
import java.nio.file.*;

public class UC11 {
    public static void main(String[] args) throws IOException {
        String name = "Alice";
        Files.writeString(Paths.get("names.txt"), name);
        String savedName = Files.readString(Paths.get("names.txt"));
        System.out.println("Reloaded: " + savedName);
    }
}