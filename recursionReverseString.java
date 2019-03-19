import java.io.BufferedReader;
import java.io.InputStreamReader;

public class recursionReverseString {
	public static String reverseString(String str) {
		if(str.isEmpty()){
			return str;
		} else {
			return reverseString(str.substring(1))+str.charAt(0);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string: ");
		String inp = reader.readLine();
		System.out.println("Reversed string is: " + reverseString(inp));
	}
}
