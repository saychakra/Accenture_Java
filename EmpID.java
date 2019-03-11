import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmpID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID");
		String inp = sc.nextLine();
		Pattern pattern = Pattern.compile("GBL/[0-9]{3}/[0-9]{4}");
		Matcher matcher = pattern.matcher(inp);
		if (matcher.matches()) {
			System.out.println("Login success");
		} else {
			System.out.println("Incorrect ID");
		}
	}
}
