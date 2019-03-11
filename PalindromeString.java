import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeString {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word:");
		String inp = reader.readLine();
		String original = inp;
		inp = inp.toLowerCase();
        //checking for invalid inputs
        char[] charArray = inp.toCharArray();
        for(char c : charArray) {
        	if (! Character.isLetter(c)) {
        		System.out.println("Invalid Input");
        		return;
        	}
         }	
        // reversing the string and checking with the original
        StringBuilder s = new StringBuilder();
        s.append(inp);
        StringBuilder reversed = s.reverse();
        String rev = reversed.toString();
        if (rev.equals(inp))
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is not a Palindrome");
	}

}