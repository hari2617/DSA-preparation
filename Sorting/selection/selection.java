import java.util.*;

// selects minimum element and put in 0 index and the element in 0 index transfered to that index .
//[30,50,10,20,40]
//[10,50,30,20,40] - step 1
//[10,20,30,50,40] -step2 
//......



public class selection{

    //time complexity 0(n^2)


    public static int[] sorting(int[] arr,int n){


        for(int i=0;i<n-2;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        return arr;
    }






    public static void main(String[] args){

        System.out.print("Enter the no of elements : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();

        }
        int result[]=sorting(arr,n);

        for(int i=0;i<n;i++){
           System.out.print(result[i]+" ");

        }

    }
}