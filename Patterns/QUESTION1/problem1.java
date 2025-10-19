import java.util.*;


public class problem1{
    
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        pattern(n);
        


    }
}