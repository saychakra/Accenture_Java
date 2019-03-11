import java.util.Scanner;

public class FirstOccurrenceReplacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println("Enter the character to be searched:");
		String ch = sc.next();
		System.out.println("Enter the character to replace:");
		String rep = sc.next();
		// or you could do inp = inp.replaceFirst(ch, rep); // just remember, replaceFirst() takes a regex as first input and the second as a string
		// checking if the search character is found within the string
		if (inp.contains(ch)) {
			System.out.println(inp.replaceFirst(ch, rep));
		} else {
			System.out.println("Character not found");
		}
	}
}
