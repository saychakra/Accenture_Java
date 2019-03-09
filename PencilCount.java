import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PencilCount {
	public static void main(String[] args) throws  Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the standard:");
		int std = Integer.parseInt(reader.readLine());
		if (std < 1 || std > 12) {
			System.out.println("Invalid Standard");
			return;
		} else {
			int[] pencils = {1, 5, 14, 30, 55, 91, 140, 204, 285, 385, 506, 650};
			System.out.printf("Nila gets %d pencils", pencils[std-1]);
		}
	}
}
