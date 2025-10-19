import java.util.*;

 class pali{
    
    
    public static void palinChk(int n){
        int temp=n;
        int revNum=0;
        while(n!=0){
            int num=n%10;
            revNum=revNum*10+num;
            n/=10;
        }
        System.out.println(revNum==temp);
    }
    
    
    
    
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
    palinChk(n);

    }
}