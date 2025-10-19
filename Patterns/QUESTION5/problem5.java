import java.util.*;

public class problem5{



    public static void pattern(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
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