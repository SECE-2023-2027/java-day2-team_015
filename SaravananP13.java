import java.util.Scanner;

public class SaravananP13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string:");
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            String tempPlaceholder = "###TEMP_PY###";
            String result = input.replace("python", tempPlaceholder)
                                 .replace("java", "python")
                                 .replace(tempPlaceholder, "java");
            System.out.println("New string:");
            System.out.println(result);
        }
    }
}
