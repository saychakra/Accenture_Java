import java.util.Scanner;

public class asciiToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = sc.nextInt();
        }
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i] + "-" + (char)digits[i]);
        }
    }
}
