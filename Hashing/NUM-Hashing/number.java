import java.util.*;


public class number{


    public static void main(String[] args){

        int[] arr={1,2,3,1,2,3,3,3,2,2,1,26};
        int [] hash=new int[31];
        //hash={0};
        for(int i=0;i<11;i++){
            hash[arr[i]]++;
        }

        System.out.println(hash[3]);
    }
}