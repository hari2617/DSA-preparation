import java.util.*;



public class character{


    public static void main(String[] args){


        String str="abbccc";
        int[] hash=new int[26];
        for(int i=0;i<6;i++){
            hash[str.charAt(i)-'a']++;
        }

        System.out.println(hash[3]);
    }
}