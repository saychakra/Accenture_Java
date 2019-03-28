import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class HighestMarks {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of semester:");
		int n = Integer.parseInt(reader.readLine());
		ArrayList<Integer> subjects = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter no of subjects in " + (i+1) + " semester:");
			int subs = Integer.parseInt(reader.readLine());
			subjects.add(subs);
		}
		ArrayList<Integer> maxMarks = new ArrayList<>();
		for (int i = 0; i < subjects.size() ; i++) {
			System.out.println("Marks obtained in semester " + (i+1));
			ArrayList<Integer> marks = new ArrayList<>();
			for (int j = 0; j < subjects.get(i); j++) {
				int mark = Integer.parseInt(reader.readLine());
				marks.add(mark);
			}
			maxMarks.add(Collections.max(marks));
		}
		for (int i = 0; i < maxMarks.size(); i++) {
			System.out.printf("Maximum mark in %d semester: %d\n", (i+1), maxMarks.get(i));
		}
	}
}
