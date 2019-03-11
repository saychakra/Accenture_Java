import java.util.Scanner;

public class CelciusConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float C = sc.nextFloat();
		System.out.printf("%.1f", ((9 * C) / 5) + 32);
	}

}
