import java.util.*;



public class problem15{


public static void pattern(int n){
    for(int i=n;i>0;i--){
        char ch='A';
        for(int j=0;j<i;j++){
            System.out.print(ch);
            ch++;
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