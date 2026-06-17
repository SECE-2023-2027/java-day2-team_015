import java.util.*;
public class SaravananP1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sec=sc.nextInt();
        int hr=sec/3600;
        int min=(sec%3600)/60;
        int totalSec=sec%60;
        System.out.printf("%d:%d:%d",hr,min,totalSec);
    }
}
