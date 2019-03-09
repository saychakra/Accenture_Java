import java.util.Scanner;

public class GainPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cp, sp, r, profit;
        System.out.println("Price of old scooter:");
        cp = sc.nextFloat();
        System.out.println("Enter the amount spent for repair:");
        r = sc.nextFloat();
        System.out.println("Sold Price:");
        sp = sc.nextFloat();
        if (cp <= 0 || sp <= 0 || r < 0)
            System.out.println("Incorrect Inputs");
        else {
            float total_cp = cp + r;
            if (sp < total_cp)
                System.out.println("Unable to calculate the Gain Percentage");
            else {
                profit = ((sp - total_cp) / total_cp) * 100;
                System.out.printf("Gain Percentage is %.2f", profit);
            }
        }
    }
}
