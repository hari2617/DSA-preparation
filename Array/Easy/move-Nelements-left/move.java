import java.util.*;



public class move{



    public static void reverse(int[] arr,int st,int sp){
        while(st<=sp){
            int t=arr[st];
            arr[st]=arr[sp];
            arr[sp]=t;
            st++;
            sp--;
        }
    }



    public static void moveLeft(int[] arr,int n,int left){

        reverse(arr,0,left-1);
        reverse(arr,left,n-1);
        reverse(arr,0,n-1);
    }


    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,7,8};
        int left=3;
        int n=8;
        moveLeft(arr,n,left);


        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    }


    
}