import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String inpNo = sc.nextLine();
        char[] charArray = inpNo.toCharArray();
        HashMap<Character, Integer> charCountMap= new HashMap<Character, Integer>();
        for (char c: charArray) {
            // if character c is already present in the charCountMap then increment it's count by 1
            if (charCountMap.containsKey(c))
                charCountMap.put(c, charCountMap.get(c) + 1);
            //  if the character c is not present in charCountMap, then putting the character in the map with the value 1
            else
                charCountMap.put(c, 1);
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
