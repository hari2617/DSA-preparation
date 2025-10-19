import java.util.*;



public class hashmapNumber{



    public static void main(String[] args){

        Map<Integer,Integer> hash=new HashMap<>();

        int[] arr={43,35,26,1,1,2,2,3,4,2,3};
        for(int i=0;i<arr.length;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1); //  getOrDefault return the existing value of the key if nothing exists returns 0
        }

        for(Map.Entry<Integer,Integer> entry:hash.entrySet()){ //everySet() is a predefined method that gives all the entries(key:value) from the hashmap
                                                                //Each entry is of type Map.Entry<Integer, Integer>
            
            
            
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

       
    }
}