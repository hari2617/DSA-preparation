import java.util.*;



public class hashmapChar{



    public static void main(String[] args){

        Map<Character,Integer> hash=new HashMap<>();

        String str="abbccc";
        for(int i=0;i<str.length();i++){
            hash.put(str.charAt(i),hash.getOrDefault(str.charAt(i),0)+1); //  getOrDefault return the existing value of the key if nothing exists returns 0
        }

        for(Map.Entry<Character,Integer> entry:hash.entrySet()){ //everySet() is a predefined method that gives all the entries(key:value) from the hashmap
                                                                //Each entry is of type Map.Entry<Integer, Integer>
            
            
            
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

       
    }
}