import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the car no: ");
        String carNo = sc.next();
        char [] array = carNo.toCharArray();
        if (array.length != 4) {
            System.out.println(carNo + " is not a valid car number");
            return;
        }
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += ((int)array[i] - 48);
            //            System.out.println((int)array[i] - 48);
        }
        if (s % 3 == 0 || s % 5 == 0 || s % 7 == 0)
            System.out.println("Lucky Number");
        else
            System.out.println("Sorry its not my lucky number");
    }
}
