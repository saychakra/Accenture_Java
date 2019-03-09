import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int n1 = sc.nextInt();
		if (n1 <= 0) {
			System.out.println("Invalid array size");
			return;
		}
		ArrayList<Integer> arr1 = new ArrayList<>();
		System.out.println("Enter the elements for first array:");
		for(int i = 0; i < n1; i++) {
			int x = sc.nextInt(); arr1.add(x);
		}
		System.out.println("Enter the size of second array:");
		int n2 = sc.nextInt();
		if (n2 <= 0) {
			System.out.println("Invalid array size");
			return;
		}
		ArrayList<Integer> arr2 = new ArrayList<>();
		System.out.println("Enter the elements for second array:");
		for(int i = 0; i < n2; i++) {
			int x = sc.nextInt(); arr2.add(x);
		}
		ArrayList<Integer> sumArray = new ArrayList<>();
		if (n1 == n2) {
			for (int i = 0; i < arr1.size(); i++) {
				sumArray.add(arr1.get(i) + arr2.get(i));
			}
		} else {
			int counterSize = Math.min(n1, n2);
			for (int i = 0, j = 0; i < counterSize && j < counterSize; i++, j++) {
				sumArray.add(arr1.get(i) + arr2.get(i));
			}
			if (n1 > n2) {
				for (int i = counterSize; i < n1; i++) {
					sumArray.add(arr1.get(i));
				}
			} else if (n2 > n1) {
				for (int i = counterSize; i < n2; i++) {
					sumArray.add(arr2.get(i));
				}
			}
		}
		for (int i = 0; i < sumArray.size(); i++) {
			System.out.println(sumArray.get(i));
		}
	}
}