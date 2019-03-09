import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchCourse {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of course:");
		int n = Integer.parseInt(reader.readLine());
		if (n <= 0) {
			System.out.println("Invalid Range");
			return;
		} else {
			String[] courses = new String[n];
			System.out.println("Enter the course names:");
			for(int i = 0; i < n; i++) {
				courses[i] = reader.readLine();
			}
			// searching for the course
			boolean flag = false;
			System.out.println("Enter the course to be searched:");
			String searchString = reader.readLine();
			for(int i = 0; i < n; i++) {
				if (courses[i].equals(searchString)) {
					flag = true;
				}
			}
			if (flag == true)
				System.out.println(searchString + " course is available");
			else 
				System.out.println(searchString + " course is not available");
		}
	}

}
