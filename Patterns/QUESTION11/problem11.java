import java.util.*;

public class problem11{

    public static void pattern(int n){

        for(int i=1;i<=n;i++){
            int st=1;
            if(i%2!=0)
                st=0;
            for(int j=0;j<i;j++){
                System.out.print(st+" ");
                st=1-st;
            }
            System.out.println();
        }
    }


        public static void main(String[] args){

            Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        pattern(n);
        }
    
}