import java.util.Scanner;

public class SaravananP15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (you can include space as well)");
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                System.out.println("The compressed string along with the counts of repeated characters is:");
                System.out.println("");
                return;
            }
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    sb.append(s.charAt(i)).append(count);
                    count = 1;
                }
            }
            System.out.println("The compressed string along with the counts of repeated characters is:");
            System.out.println(sb.toString());
        }
    }
}
