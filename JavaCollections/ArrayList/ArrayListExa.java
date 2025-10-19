import java.util.*;


public class ArrayListExa{


    public static void main(String[] args){

        ArrayList <Integer> arr =new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(null);
        arr.remove(0); // here 0 is index 

        System.out.println(arr);
        System.out.println(arr.get(3));
        System.out.println(arr.set(3,26)); // 3 is index , 26 is gonnna replace value 
        System.out.println(arr);
    }
}