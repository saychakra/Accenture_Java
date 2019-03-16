// this should have been the actual program for numerological names
// yet the program given by the shitty "brand" accenture is so full of shit, that it is not even worth looking at!
// god help them and me (for I'm nothing but a part of this huge shit!)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ActualNumerology {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[][] table = new char[][] {
				"123456789".toCharArray(),
				"abcdefghi".toCharArray(),
				"jklmnopqr".toCharArray(),
				"stuvwxyz-".toCharArray()
		};
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 9; j++) {
//				System.out.print(table[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println("Enter your name:");
		String name = reader.readLine();
		char[] nameArray = name.toCharArray();
		ArrayList<Integer> nums = new ArrayList<>();
		for (char ch : nameArray) {
			for (int j = 1; j < 4; j++) {
				for (int k = 0; k < 9; k++) {
					if (ch == table[j][k]) {
						nums.add(((int) table[0][k]) - 48);
					}
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		System.out.println("Numerological value of " + name + " is: " + sum);
	}
}
