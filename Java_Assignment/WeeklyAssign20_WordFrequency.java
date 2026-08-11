package Java_Assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
public class WeeklyAssign20_WordFrequency {

	public static void main(String[] args) {
		
				 String filePath = "input.txt";

	        Map<String, Integer> wordMap = new LinkedHashMap<>();

	        try (BufferedReader reader = new BufferedReader(
	                new FileReader(filePath))) {

	            String line;

	            while ((line = reader.readLine()) != null) {

	                // Convert line to lowercase
	                line = line.toLowerCase();

	                // Remove punctuation
	                line = line.replaceAll("[^a-zA-Z0-9 ]", "");

	                // Split line into words
	                String[] words = line.split("\\s+");

	                for (String word : words) {

	                    if (!word.isEmpty()) {
	                        wordMap.put(
	                                word,
	                                wordMap.getOrDefault(word, 0) + 1
	                        );
	                    }
	                }
	            }
	         // Display word frequency
	            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {

	                System.out.println(
	                        entry.getKey() + " : " + entry.getValue()
	                );
	            }

	        } catch (IOException e) {

	            System.out.println("Error reading file: " + e.getMessage());
	        }

	}

}
