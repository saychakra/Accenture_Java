import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		if (size <= 0) {
			System.out.println("Invalid array size");
			return;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Enter the array elements:");
		for(int i = 0; i < size; i++) {
			int x = sc.nextInt(); arr.add(x);
		}
		System.out.println("Enter the position of the element to be replicated:");
		int repPos = sc.nextInt();
		if (repPos >= arr.size()) {
			System.out.println("Position is greater than the size of an array");
			return;
		} else {
			int dupElement = arr.get(repPos);
			arr.add(dupElement);
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
