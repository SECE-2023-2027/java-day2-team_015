import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] a1=s1.toLowerCase().toCharArray();
        char[] a2=s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1, a2));
    }
}
