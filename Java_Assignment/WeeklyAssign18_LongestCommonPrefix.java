package Java_Assignment;

public class WeeklyAssign18_LongestCommonPrefix {

	public static void main(String[] args) {
		String[] words = {"flower", "flow", "flight"};

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {

            while (!words[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    System.out.println("No common prefix");
                    return;
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }

	}


