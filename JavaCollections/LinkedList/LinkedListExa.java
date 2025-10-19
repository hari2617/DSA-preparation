import java.util.*;


public class LinkedListExa{


    public static void main(String[] args){

        LinkedList <Integer>  arr =new LinkedList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.addFirst(26);
        arr.add(2);
        arr.addLast(100);
        
        //arr.remove(0); // here 0 is index 
        

        System.out.println(arr);
        System.out.println(arr.getFirst());
        arr.removeLast();
        System.out.println(arr);
    }
}