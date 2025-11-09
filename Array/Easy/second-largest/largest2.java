import java.util.*;



public class largest2{


    public static void main(String[] args){

        int[] arr={2,3,77,56,94,37};

        int l=arr[0];
        int sl=Integer.MIN_VALUE;

        for(int i=0;i<6;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            if(arr[i]>sl&&arr[i]!=l){
                sl=arr[i];
            }
        }


        System.out.println(sl);
    }
}