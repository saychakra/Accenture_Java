import java.util.Scanner;

public class MovieTicketCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float total_cost = 0.0f;
		System.out.print("Enter the no of ticket:");
		int n = sc.nextInt();
		if (n < 5 || n > 40) {
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			sc.close();
			return;
		} else {
			System.out.print("Do you want refreshments:");
			String r_choice = sc.next();
			System.out.print("Do you have coupon code:");
			String c_choice = sc.next();
			System.out.print("Enter the circle:");
			String circle = sc.next();
			if (circle.equalsIgnoreCase("k")) {
				if (c_choice.equalsIgnoreCase("y")) {
					float coupon_discount = (float) (75.0 - (0.02 * 75));
					total_cost = (n * coupon_discount);
				} else if (c_choice.equalsIgnoreCase("n")) {
					total_cost = (n * 75);
				}
			} else if (circle.equalsIgnoreCase("q")) {
				if (c_choice.equalsIgnoreCase("y")) {
					float coupon_discount = (float) (150.0 - (0.02 * 150));
					total_cost = (n * coupon_discount);
				} else if (c_choice.equalsIgnoreCase("n")) {
					total_cost = (n * 150);
				}
			}
			if (n > 20) {
				float bulkDiscount = (float) (0.1 * total_cost);
				total_cost -= bulkDiscount;
				System.out.println("after applying bulk discount:");
				System.out.println(total_cost);
			}
			if (r_choice.equalsIgnoreCase("y")) {
				float ref_cost = (n * 50);
				total_cost += ref_cost;
				System.out.println("Adding" + ref_cost + "for refreshments: " + total_cost);
			}
			System.out.printf("Ticket cost: %.2f", total_cost);
			sc.close();
		}
	}
}
