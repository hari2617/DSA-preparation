import java.util.*;

 class countdig{
public  int count(int n){
    int temp=n;
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
}
}


public class countDigits{

    public static void main(String[] args){

    Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
    countdig c=new countdig();
    int cnt=c.count(n);
    System.out.println("NUMBER OF DIGITS : "+cnt);
    }
}