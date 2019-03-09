import java.util.Scanner;

public class FindReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("Enter the word to be searched:");
		String searchKey = sc.nextLine();
		System.out.println("Enter the word to be replaced:"); // this is completely wrong query in terms of the program! But what the hell!
		String replaceKey = sc.nextLine();
		if(str.contains(searchKey)) {
			System.out.println(str.replace(searchKey, replaceKey));
		} else {
			System.out.println("The word " + searchKey + " not found");
			return;
		}
	}
}
