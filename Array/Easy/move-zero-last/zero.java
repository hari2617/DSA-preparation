import java.util.*;



public class zero{


    public static void moveZero(int[] arr ,int n){

        int i=0;

        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
            }
        }


        for(int h=0;h<n;h++){
        System.out.print(arr[h]+" ");
       }

    }


    public static void main(String[] args){

       int[] arr={1,0,2,3,0,3,5,0,0,6};
       int n=arr.length;

       moveZero(arr,n);


       
    }
}