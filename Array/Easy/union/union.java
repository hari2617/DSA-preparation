import java.util.*;



public class union{


   static ArrayList<Integer> unionArr(int[] arr,int[] arr1,int n,int m){
        int i=0;
        int j=0;

        ArrayList<Integer> union=new ArrayList<>();

        while(i<n&&j<m){

            if(arr[i]<=arr1[j]){

                if(union.size()==0||union.get(union.size()-1)!=arr[i]){
                    union.add(arr[i]);
                    
                }

                i++;
            }
            else{

                if(union.size()==0||union.get(union.size()-1)!=arr1[j]){
                    union.add(arr1[j]);
                    
                }

                j++;
            }
        }


        while(i<n){

            if(union.get(union.size()-1)!=arr[i]){
                    union.add(arr[i]);
                 
                }

                i++;
        }

        while(j<m){

             if(union.get(union.size()-1)!=arr1[j]){
                    union.add(arr1[j]);
                   
                }
                j++;
        }


        return union;
    }


    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] arr1={2,3,4,5,6,7};

        ArrayList<Integer> union=unionArr(arr,arr1,arr.length,arr1.length);

        for(int i: union){
            System.out.print(i+" ");
        }
    }
}