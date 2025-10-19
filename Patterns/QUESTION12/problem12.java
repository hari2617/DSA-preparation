import java.util.*;


public class problem12{

    public static void pattern(int n){

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            for(int j=0;j<(2*n-2*i);j++){
                System.out.print(" ");
            }

            for(int j=i;j>0;j--){
                System.out.print(j);
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