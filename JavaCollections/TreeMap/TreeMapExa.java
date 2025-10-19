import java.util.*;


public class TreeMapExa{


    public static void main(String[] args){

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(26,"apple");
        map.put(1,"samsung"); // put(key,value);
        map.put(2,"redmi");
        map.put(3,"poco");


        System.out.println(map);

        System.out.println(map.remove(3));  //remove(key);

        System.out.println(map.get(26));  //get(key);
    }
}