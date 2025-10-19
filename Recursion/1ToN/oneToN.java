import java.util.*;


public class oneToN{
    

    public static int k=1;
    public static void nTimes(int n){
        if(k==n+1)
        return;
        System.out.println(k);
        k++;
        nTimes( n);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nTimes(n);
    }
}