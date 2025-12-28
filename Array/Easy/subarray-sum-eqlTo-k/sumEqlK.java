import java.util.*;

class sumEqlK{
public static void main(String[] args){

    int[] arr={1,2,3,1,1,1,1,3,3};
    int k=6;

    int l=0,r=0;
    int maxLen=arr[0];
    int sum=0;
    while(r<arr.length){
        
        while(l<=r && sum>k)
        {
            
                sum-=arr[l];
                l++;
            
        }
        r++;
        if(r<arr.length){
        
        sum+=arr[r];}
        if(sum==k){
            if(r-l>maxLen){
                maxLen=r-l;
            }
        }
    }

    System.out.println(maxLen);

}
}