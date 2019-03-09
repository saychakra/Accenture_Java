import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		if (size  <= 0) {
			System.out.println("Invalid Array Size");
			return;
		} else {
			System.out.println("Enter the elements:");
			ArrayList<Integer> arr = new ArrayList<>(size);
			for(int i = 0; i < size; i++) {
				int x = sc.nextInt();
				arr.add(x);
			}
			int max = Collections.max(arr);
			int min = Collections.min(arr);
			System.out.println(max+min);
		}
	}
}
