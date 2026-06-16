import java.util.*;
public class problem2 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)  return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int count=0;
        int i=2;
        int sum=0;
        while(count<100){
            if(isPrime(i)){
                sum+=i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
