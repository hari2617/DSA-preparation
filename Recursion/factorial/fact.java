import java.util.*;


public class fact{


    public static int sum=1;
    public static void facto(int n){

        if(n==0){
        System.out.println(sum);
        return;}
        sum*=n;
        facto(--n);
        

    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        facto(n);
    }
}