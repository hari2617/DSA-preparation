import java.util.*;



public class HashSetExa{


    public static void main(String[] args){
        HashSet<Integer> arr=new HashSet<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);  // add();
        arr.add(3);
        arr.add(26);

        System.out.println(arr);

        arr.remove(26);  // Here 26 is element  // remove(e);

        System.out.println(arr);

        System.out.println(arr.contains(1));   //contains(e) ;

        System.out.println(arr.size());  //size();

    }
}