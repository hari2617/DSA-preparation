import java.util.*;




public class highLowFreq{



    public static void mapInsert(int[] arr,int n){
        Map<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<n;i++){
            maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
        }

        int min=maps.get(arr[0]),max=maps.get(arr[0]);
        int keyMax=arr[0];
        int keyMin=arr[0];

        for(Map.Entry<Integer,Integer> entry : maps.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                keyMax=entry.getKey();
            }
            if(entry.getValue()<min){
                min=entry.getValue();
                keyMin=entry.getKey();
            }

        }


        System.out.println(" Minimum : "+keyMin+" Maximum : "+keyMax);
    }




    public static void main(String[] args){
        
        
        System.out.println("Enter the no of elements : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();

        }
        mapInsert(arr,n);
    }
}