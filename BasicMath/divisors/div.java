import java.util.*;


public class div{

    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        List <Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }

        }
        System.out.println(arr);

    }
}