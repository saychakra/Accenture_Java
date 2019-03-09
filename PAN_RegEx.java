import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PAN_RegEx {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your PAN number");
		String panID = reader.readLine();
		Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		// matching the pattern
		Matcher matcher = pattern.matcher(panID);
		//checking if the pattern matches
		if (matcher.matches()) {
			System.out.println("Valid PAN number");
		} else {
			System.out.println("Invalid PAN number");
		}
	}
}
