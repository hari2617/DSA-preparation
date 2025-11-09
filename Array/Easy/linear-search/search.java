import java.util.*;



public class search{


    public static void main(String[] args){

        int[] arr={1,2,5,3,6,7,8,10};
        int k=6;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(i);
                break;
            }
        }
    }
}