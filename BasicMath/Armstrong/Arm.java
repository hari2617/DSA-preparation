import java.util.*;

public class Arm{

    public static void armChk(int n){
        int temp=n;
        int temp2=n;
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        int sum=0;
        while(temp!=0){
            int num=temp%10;
            sum+=(int)(Math.pow(num,c));
            temp/=10;
        }
        System.out.println(sum==temp2?"Armstrong number":"not Armstrong number");
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        armChk(n);  
        }
}