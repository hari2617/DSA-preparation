import java.util.*;



public class LinkedHashSetExa{


    public static void main(String[] args){


        LinkedHashSet <String> str =new LinkedHashSet<>();

        str.add("chennai");
        str.add("Tiruppur");
        str.add("Dharmapuri"); //add();
        str.add("chennai");


        System.out.println(str);


        str.remove("chennai");  //remove(e);

        System.out.println(str);

        System.out.println(str.contains("Tiruppur"));  //contains(e);

        System.out.println(str.size());  //size();

        str.clear();
        System.out.println(str);

    }
}