import java.util.*;

public class problem10{

    public  static void  pattern(int n ){
        for(int i=1;i<=2*n-1;i++){
            int range;
            if (i<=n) {
                range=i;}
            else {
                range=2*n-i;}
            for(int j=0;j<range;j++){
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