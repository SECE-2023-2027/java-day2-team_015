import java.util.*;

public class SaravananP5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)    arr.add(sc.nextInt());
        int k=sc.nextInt();
        int idx=arr.size()-k;
        if(idx>=0 && idx<arr.size())    arr.remove(idx);
        for(int a:arr)
            System.out.print(a+" ");
    }
}
