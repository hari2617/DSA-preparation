import java.util.*;


public class fibo{


    public static void fibona(int n1,int n2,int sp){
        if(sp==2)
            return;
        int sum=n1+n2;
        n1=n2;
        n2=sum;
        System.out.print(" "+n2);
        fibona(n1,n2,--sp);
    }


    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(0+" "+1);
        fibona(0,1,n);
    }
}