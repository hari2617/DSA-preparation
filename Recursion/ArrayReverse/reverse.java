import java.util.*;



class displayn{
     public static void  display(int[] arr){
    for(int i:arr){
        System.out.print(i+" ");
    }
}
}

public class reverse extends displayn{

    public static int i=0;
    public static void rev(int st,int sp, int[] arr){
        if(st>=sp){
            return;
        }
        
        int temp=arr[sp];
        arr[sp]=arr[st];
        arr[st]=temp;
        rev(st+1,sp-1,arr);


    }

    public static void main(String args[]){

        int[] arr={1,2,3,4,5};
        rev(0,arr.length-1,arr);
        display(arr);
    }
}