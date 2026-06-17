import java.util.*;

public class SaravananP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of students:");
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        System.out.println("Input Student Name, ID, Score:");
        
        String maxName = "", minName = "";
        String maxId = "", minId = "";
        int maxScore = -1, minScore = 101;
        
        for (int i = 0; i < n; i++) {
            if (sc.hasNext()) {
                String name = sc.next();
                String id = sc.next();
                int score = sc.nextInt();
                
                if (score > maxScore) {
                    maxScore = score;
                    maxName = name;
                    maxId = id;
                }
                if (score < minScore) {
                    minScore = score;
                    minName = name;
                    minId = id;
                }
            }
        }
        
        System.out.println("name, ID of the highest score and the lowest score:");
        System.out.println(maxName + " " + maxId);
        System.out.println(minName + " " + minId);
    }
}
