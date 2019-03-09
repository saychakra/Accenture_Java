import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomerDetails {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name, gender, city;
        int age;
        System.out.print("Enter your name:");
        name = reader.readLine();
        System.out.print("Enter age:");
        String str_age = reader.readLine();
        age = Integer.parseInt(str_age);
        System.out.print("Enter gender:");
        gender = reader.readLine();
        System.out.print("Hailing from:");
        city = reader.readLine();

        System.out.println("Welcome, " + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("City:" + city);
    }
}
