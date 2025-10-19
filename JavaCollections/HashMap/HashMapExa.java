import java.util.*;


public class HashMapExa{



    public static void main(String args[]){


        Map<Character,Integer> map=new HashMap<>();

        //apple

        map.put('a',1);
        map.put('p',2);
        map.put('l',1); // put(key,value);
        map.put('e',1);


        System.out.println(map.get('p')); // get(key);

        System.out.println(map);

        System.out.println(map.containsKey('l')); //containsKey(key);

        System.out.println(map.keySet()); //keySet();

        map.remove('a');  //remove();

        System.out.println(map);

    }
}