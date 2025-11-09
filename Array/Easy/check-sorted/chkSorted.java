import java.util.*;


public class chkSorted{


    public static void main(String[] args){

        int[] arr={2,6,3,12,5,1};
        int[] arr1={1,2,3,4,5};

        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>=arr1[i-1]){
                continue;
            }
            else{
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}