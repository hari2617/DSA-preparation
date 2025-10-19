import java.util.*;

public class gcdchk{


    public static void gcdfunc(int n1,int n2){
        
        int min=n1>n2?n2:n1;
        int gcd=0;
        for(int i=min;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(gcd);
    }
    
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        gcdfunc(n1,n2);
    }
}