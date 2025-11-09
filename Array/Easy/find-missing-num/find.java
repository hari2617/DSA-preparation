import java.util.*;


public class find{



    public static void main(String[] args){

        int[] arr={2,5,1,3};
        int n=5;

        int tot=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }

        System.out.println(tot-sum);

    }
}