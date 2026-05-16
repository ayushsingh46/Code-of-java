import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class fileWriteDemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("app_log.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            pw.println("Log Entry: " + LocalDateTime.now() + " - User logged in.");
            System.out.println("Data successfully written to app_log.txt");
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
