import java.util.*;

public class SaravananP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine(); // Consume remaining newline
        
        List<String> words = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (sc.hasNext()) {
                String word = sc.next();
                words.add(word);
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }
        }
        
        List<String> longestWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }
        
        for (int i = 0; i < longestWords.size(); i++) {
            System.out.print(longestWords.get(i));
            if (i < longestWords.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
