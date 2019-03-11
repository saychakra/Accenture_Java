import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class initCap {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		String stringList[] = br.readLine().split(" ");
		ArrayList<String> ans = new ArrayList<>();
		int initCapCount = 0;
		for (String str : stringList) {
			String initCapStr = str.substring(0, 1).toUpperCase();
			if (initCapStr.equals(str.substring(0, 1)))
				initCapCount ++;
			String finalString = initCapStr + str.substring(1);
			ans.add(finalString);
		}
		if (initCapCount == stringList.length) {
			System.out.println("First character of each word is already in uppercase");
			return;
		}
		for(String s : ans) {
			System.out.print(s + " ");
		}
	}
}
