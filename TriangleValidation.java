import java.util.Scanner;

public class TriangleValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for side1:");
        int s1 = sc.nextInt();
        System.out.println("Enter the value for side2:");
        int s2 = sc.nextInt();
        System.out.println("Enter the value for side3:");
        int s3 = sc.nextInt();
        if (s1 <= 0 || s2 <= 0 || s3 <= 0)
            System.out.println("Invalid Input");
        else {
            if ((s1 + s2) > s3 && (s1 + s3) > s2 && (s3 + s2) > s1) {
                System.out.println("Sides form a Triangle");
            } else {
                System.out.println("Sides do not form a Triangle");
            }
        }
    }
}
