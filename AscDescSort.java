import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class AscDescSort {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array:");
		int n = Integer.parseInt(reader.readLine());
		if (n <= 0) {
			System.out.println("Array size should be greater than 0");
			return;
		}
		Integer[] arr = new Integer[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}
		Integer[] firstHalf = Arrays.copyOfRange(arr, 0, n/2+1);
		Arrays.sort(firstHalf);
		Integer[] secondHalf = Arrays.copyOfRange(arr, n/2+1, arr.length);
		Arrays.sort(secondHalf, Collections.reverseOrder());
		for (int i = 0; i < firstHalf.length; i++) {
			System.out.println(firstHalf[i]);
		}
		for (int i = 0; i < secondHalf.length; i++) {
			System.out.println(secondHalf[i]);
		}
	}
}
