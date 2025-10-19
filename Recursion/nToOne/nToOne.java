import java.util.*;


public class nToOne{


        public static void nTimes(int n){
            if(n==0){
                return;
            }

            System.out.println(n);
            n--;
             nTimes(n);
        }

        public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            nTimes(n);
        }
}