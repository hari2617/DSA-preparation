import java.util.*;


public class problem17{


public static void pattern(int n){

    for(int i=0;i<n;i++){
        
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        char ch ='A';
        int brk=(2*i+1)/2;

        for(int j=1;j<=i+i+1;j++){
            System.out.print(ch);
            if(j<=brk) ch++;
            else ch--;

            
        }

        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
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