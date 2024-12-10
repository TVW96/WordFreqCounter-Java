import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordCountMap = new TreeMap<>();  // TreeMap to keep the words sorted

        System.out.println("Enter text (type 'exit' to quit):");

        while (true) {
            // Read a line of text from the user
            String input = scanner.nextLine();

            // Check if the user wants to exit the program
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Normalize input (convert to lowercase) and split into words
            String[] words = input.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

            // Process each word
            for (String word : words) {
                if (word.length() > 0) {  // Ignore empty strings
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        // Output the word frequencies, sorted alphabetically
        System.out.println("\nWord Frequency Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
