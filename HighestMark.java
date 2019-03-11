import java.util.Arrays;
import java.util.Scanner;

public class HighestMark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[6];
		for (int i = 0; i < 6; i++) {
			int mark = sc.nextInt();
			if (mark < 0) {
				System.out.println("Invalid mark");
				return;
			} else {
				marks[i] = mark;
			}
		}
		Arrays.sort(marks);
		System.out.println("Highest mark is " + marks[marks.length - 1]);
	}

}
