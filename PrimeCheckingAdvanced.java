import java.util.Scanner;
import java.math.BigInteger;

public class PrimeCheckingAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		// checking for the invalid input conditions
		if (n1 <= 0 || n2 <= 0 || n1 > n2 || (n2-n1) <= 0) {
			System.out.println("Provide valid input");
			return;
		} else {
			for (int i = n1; i <= n2; i++) {
				BigInteger b = new BigInteger(String.valueOf(i));
				if (b.isProbablePrime(1)) {
					System.out.print(i + " ");
				}
			}
		}
		sc.close();
	}
}
