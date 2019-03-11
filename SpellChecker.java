import java.util.Scanner;

public class SpellChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "RAINBOW";
        char[] inputWord = new char[7];
        char s;
        System.out.print("Enter the first letter:");
        s = sc.next().charAt(0);
        inputWord[0] = s;
        System.out.print("Enter the second letter:");
        s = sc.next().charAt(0);
        inputWord[1] = s;
        System.out.print("Enter the third letter:");
        s = sc.next().charAt(0);
        inputWord[2] = s;
        System.out.print("Enter the fourth letter:");
        s = sc.next().charAt(0);
        inputWord[3] = s;
        System.out.print("Enter the fifth letter:");
        s = sc.next().charAt(0);
        inputWord[4] = s;
        System.out.print("Enter the sixth letter:");
        s = sc.next().charAt(0);
        inputWord[5] = s;
        System.out.print("Enter the seventh letter:");
        s = sc.next().charAt(0);
        inputWord[6] = s;
        String inpString = String.valueOf(inputWord);
        if (inpString.toUpperCase().equals(word.toUpperCase()))
            System.out.println("RAINBOW");
        else
            System.out.println("The spelling is wrong");
    }
}
