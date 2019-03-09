import java.io.BufferedReader;
import java.io.InputStreamReader;

public class leapYearChecker {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Year:");
		int yr = Integer.parseInt(reader.readLine());
		if (yr % 4 == 0 && yr % 100 != 0) {
			System.out.println("Leap Year");
		} else if (yr % 100 == 0 && yr % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}
}
