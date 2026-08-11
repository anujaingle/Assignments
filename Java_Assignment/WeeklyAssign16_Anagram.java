package Java_Assignment;
import java.util.Arrays;
public class WeeklyAssign16_Anagram {

	public static void main(String[] args) {
		   String str1 = "listen";
	        //String str2 = "silent";
		   String str2 = "Check";

	        // Convert both strings to lowercase
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        // If lengths are different, they cannot be anagrams
	        if (str1.length() != str2.length()) {
	            System.out.println("Not Anagram");
	            return;
	        }

	        // Convert strings into character arrays
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        // Sort both arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted arrays
	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println("Anagram");
	        } else {
	            System.out.println("Not Anagram");
	        }

	}

}
