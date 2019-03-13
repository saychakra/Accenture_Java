import java.util.ArrayList;
import java.util.Scanner;

public class SingleDigitFactorial {
	public static long fact(int n) {
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			int x = sc.nextInt(); arr.add(x);
		}
		boolean flag = false;
		long sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) >= 1 && arr.get(i) <= 9) {
				flag = true;
				sum += fact(arr.get(i));
			}
		}
		if (flag == false) {
			System.out.println("No positive and single digit numbers found in an array");
			return;
		} else {
			System.out.println(sum);
		}
	}
}
