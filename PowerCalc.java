import java.util.Scanner;

public class PowerCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		double base = sc.nextDouble();
		System.out.println("Enter the digit:");
		double index = sc.nextDouble();
		double ans = Math.pow(base, index);
		System.out.println((int)ans);
	}

}
