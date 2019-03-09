import java.util.Scanner;

public class FirstOccurrenceReplacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println("Enter the character to be searched:");
		String ch = sc.next();
		System.out.println("Enter the character to replace:");
		String rep = sc.next();
		System.out.println(inp.replaceFirst(ch, rep));
	}
}
