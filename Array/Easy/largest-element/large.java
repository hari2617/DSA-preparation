import java.util.*;


public class large{



    public static void main(String[] args){

        int[] arr={2,4,8,11,4,99};
        int n=6;
        int max=arr[0];

        for(int i=0;i<n;i++){

            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println(max);
    }
}