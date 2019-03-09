import java.util.Scanner;

public class CheckFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Boolean flag = false;
        int i = 1;
        for(int s = 1; s <= num; i++) {
            s *= i;
            if (s == num) {
                flag = true;
                break;
            }
        }
        if (flag == true)
            System.out.println(num + " is factorial of: " + i);
        else
            System.out.println("Sorry. The given number is not a perfect factorial");
    }
}
