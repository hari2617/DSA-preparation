import java.util.*;


class  insertion{


    public static int[] insertionSort(int[] arr,int n){

        for(int i=0;i<n;i++){

            int j=i;

            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }


    public static void main(String[] args){

         int[] arr={2,3,1,5,4};
        int[] res=insertionSort(arr,5);
        for(int i=0;i<5;i++){
            System.out.print(res[i]+" ");
        }

    }
}