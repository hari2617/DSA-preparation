import java.util.*;


public class LinkedHashMapExa{


    public static void main(String[] args){

        Map <Integer,Character> map =new LinkedHashMap<>(); 

        map.put(2,'z');
        map.put(3,'b');
        map.put(1,'a'); //put();
        map.put(6,'a');


        System.out.println(map);

        

        System.out.println(map.get(6));  // get(key)

        System.out.println(map.remove(3));  //remove(key);

        System.out.println(map);

    }
}