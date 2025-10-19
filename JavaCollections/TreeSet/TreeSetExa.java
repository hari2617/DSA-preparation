import java.util.*;


public class TreeSetExa{


    public static void main(String[] args){

        Set<Integer> intSet=new TreeSet<>(); // we can also do like this 

        intSet.add(6);
        intSet.add(26);   //add();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3); 
        intSet.add(4);

        System.out.println(intSet);

        intSet.remove(6); //remove(e);

        System.out.println(intSet);

        System.out.println(intSet.contains(26));  //contains(e);

        System.out.println(intSet.size());    //size();





    }
}