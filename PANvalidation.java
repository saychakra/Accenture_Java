import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PANvalidation {
	public static boolean checkUpperCase(String inp) {
		for (int i = 0; i < inp.length(); i++) {
			if(! Character.isUpperCase(inp.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkAlphabet(String inp) {
		for (int i = 0; i < inp.length(); i++) {
			if (! Character.isAlphabetic(inp.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the PAN no:");
		String PAN = reader.readLine();
		if (PAN.length() != 10) {
			System.out.println("Invalid PAN no");
		} else {
			// extracting only the first 5 characters from the string
			String firstFive = PAN.substring(0, 4);
			if (! checkUpperCase(firstFive) || !checkAlphabet(firstFive)) {
				System.out.println("Invalid PAN no");
				return;
			}
		}
	}
}
