import java.util.*;


class subarr{

    public static int findSubarr(int[] arr,int k){

        int sum=0;
        int len=0;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==k){
                len=i+1;
            }

             int sub=sum-k;
            if(map.containsKey(sub)){
                int l=i-map.get(sub);
                len=Math.max(len,l);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        
           
        }
        return len;
    }

    public static void main(String[] args){

        int[] arr={2,3,5};
        int k=5;

        int len=findSubarr(arr,k);
        System.out.println(len);
    }
}