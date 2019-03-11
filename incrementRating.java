import java.util.Scanner;

public class incrementRating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		System.out.println("Enter the Performance appraisal rating");
		float rating = sc.nextFloat();
		if (salary <= 0 || rating < 1 || rating > 5) {
			System.out.println("Invalid Input");
			return;
		} else {
			if (rating >= 1 && rating <= 3) {
				int increment = (int)(0.1 * salary);
				salary += increment;
				System.out.println(salary);
			} else if (rating >= 3.1 && rating <= 4) {
				int increment = (int)(0.2 * salary);
				salary += increment;
				System.out.println(salary);
			} else if (rating >= 4.1 && rating <= 5) {
				int increment = (int)(0.3 * salary);
				salary += increment;
				System.out.println(salary);
			}
		}
	}
}
