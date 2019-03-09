import java.util.Scanner;

public class BonusPoints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance travelled");
		String dist = sc.next();
		char[] distArray = dist.toCharArray();
		int oddPlace=1, evenPlace=1;
		for(int i = 0; i < distArray.length; i++) {
			if (i % 2 == 0) {
				evenPlace *= Character.getNumericValue(distArray[i]);
			} else {
				oddPlace *= Character.getNumericValue(distArray[i]);
			}
		}
		System.out.println("Odd Places Product: " + oddPlace);
		System.out.println("Even Places Product: " + evenPlace);
		if (oddPlace > evenPlace) {
			System.out.println("Your bonus points is " + oddPlace);
		} else if (oddPlace == evenPlace) {
			System.out.println("Your bonus points is " + oddPlace*2);
		} else {
			System.out.println("Your bonus points is " + evenPlace);
		}
//		for(int i = 0; i < distArray.length; i++) {
//			//System.out.println(Character.getNumericValue(distArray[i]));
//			// same as
//			System.out.println((int)distArray[i] - 48);
//		}
	}
}
