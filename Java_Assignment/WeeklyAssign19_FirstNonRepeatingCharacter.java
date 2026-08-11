package Java_Assignment;
import java.util.LinkedHashMap;
import java.util.Map;
public class WeeklyAssign19_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		 String str = "swiss";

	        Map<Character, Integer> map = new LinkedHashMap<>();

	        // Count frequency of each character
	        for (char ch : str.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }

	        // Find first character with frequency 1
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

	            if (entry.getValue() == 1) {
	                System.out.println("First Non-Repeating Character: "
	                        + entry.getKey());
	                return;
	            }
	        }

	        System.out.println("No non-repeating character found");

	}

}
