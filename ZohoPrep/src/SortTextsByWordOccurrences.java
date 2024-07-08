import java.util.*;

public class SortTextsByWordOccurrences {
    
    // Function to count occurrences of the word in the text
    public static int countOccurrences(String text, String word) {
        String[] words = text.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of texts
        int M = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read the word to count occurrences
        String word = scanner.nextLine();

        // Read the texts
        List<String> texts = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            texts.add(scanner.nextLine());
        }

        // Sort the texts based on the number of occurrences of the word
        texts.sort(Comparator.comparingInt(text -> countOccurrences(text, word)));

        // Output the sorted texts
        for (String text : texts) {
            System.out.println(text);
        }

        scanner.close();
    }
}
