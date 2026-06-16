import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        int[] arr={1,4,6,7,6,2};
        int val=6;
        int i=0;
        for(int a:arr){
            if(a!=val){
                arr[i]=a;
                i++;
            }
        }
        for(int j=0;j<i;j++)
            System.out.print(arr[j]+" ");
    }
}
