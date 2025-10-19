import java.util.*;
public class problem2{


    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        pattern(n);
    }
}