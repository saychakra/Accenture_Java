import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        String inpNum = reader.readLine();
        StringBuilder s = new StringBuilder();
        s.append(inpNum);
        System.out.println("Output is:" + s.reverse());
    }
}
