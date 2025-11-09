import java.util.*;


public class secSmall{


    public static void main(String[] args){


        int[] arr={8,3,4,10,33,56,1};
        int small=arr[0];
        int sSmall=Integer.MAX_VALUE;

        for(int i=0;i<7;i++){
            if(arr[i]<small){
                sSmall=small;
                small=arr[i];
            }

            if(arr[i]<sSmall && arr[i]!=small){
                sSmall=arr[i];
            }
        }

        System.out.println(sSmall);
    }
}