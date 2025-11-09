import java.util.*;


public class move{


    public static void main(String[] args){

        int []arr={1,2,3,4,5,6,7,8};
        int n=8;
        int temp=arr[0];
        int j=0;

        for(int i=1;i<n;i++){
            arr[j++]=arr[i];
        }

        arr[n-1]=temp;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}