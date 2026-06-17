import java.util.*;

public class SaravananP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] rotated = {arr[1], arr[2], arr[0]};
        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
}
