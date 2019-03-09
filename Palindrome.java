import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        StringBuilder s = new StringBuilder();
        s.append(inp);
        StringBuilder reversed = s.reverse();
        String rev = reversed.toString();
        if (rev.equals(inp))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
