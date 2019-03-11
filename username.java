import java.io.BufferedReader;
import java.io.InputStreamReader;

public class username {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name:");
        String inputName = reader.readLine();
        System.out.println("Welcome " + inputName);
    }
}
