import java.util.*;
public class SaravananP4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            boolean flag=true;
            for(int j=0;j<s1.length();j++){
                if(i==j) continue;
                char a=s1.charAt(i);
                char b=s1.charAt(j);
                if(a==b){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                break;
            }
        }
    }
}
