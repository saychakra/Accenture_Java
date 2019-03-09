import java.util.*;

public class uniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String inp = sc.nextLine();

        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        for(int i = 0; i < inp.length(); i++) {
            if (Character.isAlphabetic(inp.charAt(i)) || inp.charAt(i) == ' ') {
                if (hashMap.containsKey(inp.charAt(i))) {
                    hashMap.put(inp.charAt(i), hashMap.get(inp.charAt(i)) + 1);
                } else {
                    hashMap.put(inp.charAt(i), 1);
                }
            } else {
                System.out.println("Invalid Sentence");
                return;
            }
        }
        int flag = 0;
        ArrayList<Character> arrls = new ArrayList<>();
        for(Map.Entry entry : hashMap.entrySet()) {
            if ((int)entry.getValue() == 1) {
            	arrls.add((char)entry.getKey());
            	flag += 1;
            }
        }
        if (flag > 0) {
	        System.out.println("Unique characters:");
        	for (int i = 0; i < arrls.size(); i++) {
		        System.out.println(arrls.get(i));
	        }
        }else if (flag == 0) {
	        System.out.println("No unique characters");
        }
    }
}
