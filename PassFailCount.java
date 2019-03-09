import java.util.Scanner;

public class PassFailCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of subjects:");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid input range");
			return;
		} else {
			int[] marks = new int[n];
			for(int i = 0; i < n; i++) {
				int mark = sc.nextInt();
				if (mark < 0) {
					System.out.println("Invalid mark");
					return;
				} else {
					marks[i] = mark;
				}
			}
			
			//if marks < 50 then fail. Otherwise pass
			int passCount = 0, failCount = 0;
			for(int i = 0; i < n; i++) {
				if (marks[i] >= 50)
					passCount++;
				else 
					failCount++;
			}
			if (passCount == n) {
				System.out.println("Ram passed in all subjects");
				return;
			} else if (failCount == n) {
				System.out.println("Ram failed in all subjects");
				return;
			} else {
				System.out.printf("Ram passed in %d subjects and failed in %d subjects", passCount, failCount);
				return;
			}
		}
	}

}
