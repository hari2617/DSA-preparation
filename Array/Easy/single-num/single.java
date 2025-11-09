import java.util.*;


public class single{

    public static void main(String[] args){

        int arr[]={2,2,3,3,6};

        int num=0;

        for(int i=0;i<arr.length;i++){
            num^=arr[i];

        }

        System.out.println(num);
    }
}