import java.util.*;


public class bubble{


    //time complexity 0(n^2)

    //[20,30,10,50,40]
    //[20,10,30,50,40] -- step 1
    //[10,20,30,40,50]



    public static int[] bubbleSort(int[] arr,int n){

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args){

        int[] arr={2,3,1,5,4};
        int[] res=bubbleSort(arr,5);
        for(int i=0;i<5;i++){
            System.out.print(res[i]+" ");
        }
    }
}