import java.util.*;


public class sum1ToN{


    public static int  sum=0;
    public static void sumrec(int n){
        if(n==0){
            System.out.println(sum);
            return;}
        sum+=n;
        --n;
        sumrec(n);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumrec(n);
    }
}