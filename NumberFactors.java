import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberFactors {
	static void findFactors(int n) {
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println(n);
	}
	public static void main(String[] args) throws  Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		if (n == 0) {
			System.out.println("No Factors");
			return;
		} else if (n < 0) {
			n *= (-1);
			findFactors(n);
		} else {
			findFactors(n);
		}
	}
}