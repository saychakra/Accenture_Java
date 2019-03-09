import java.util.Scanner;

public class HighestPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cse, ece, mech;
        System.out.print("Enter the number of students placed in CSE:");
        cse = sc.nextInt();
        System.out.print("Enter the number of students placed in ECE:");
        ece = sc.nextInt();
        System.out.print("Enter the number of students placed in MECH:");
        mech = sc.nextInt();
        if (cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Input is invalid");
            return;
        }
        if (cse == mech && mech == ece) {
            System.out.println("None of the department has got the highest placement");
            return;
        }

        if (cse > ece) {
            if (cse > mech) {
                System.out.println("Highest placement");
                System.out.println("CSE");
                return;
            } else if (cse == mech) {
                System.out.println("Highest placement");
                System.out.println("CSE");
                System.out.println("MECH");
                return;
            }
        } else if (cse == ece) {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
            return;
        }
        if (ece > cse) {
            if (ece > mech) {
                System.out.println("Highest placement");
                System.out.println("ECE");
                return;
            } else if (ece == mech) {
                System.out.println("Highest placement");
                System.out.println("ECE");
                System.out.println("MECH");
                return;
            }
        } else if (ece == cse) {
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("CSE");
            return;
        }
        if (mech > cse) {
            if (mech > ece) {
                System.out.println("Highest placement");
                System.out.println("MECH");
                return;
            } else if (mech == ece) {
                System.out.println("Highest placement");
                System.out.println("MECH");
                System.out.println("ECE");
                return;
            }
        } else if (mech == cse) {
            System.out.println("Highest placement");
            System.out.println("MECH");
            System.out.println("CSE");
            return;
        }
    }
}
