import java.util.*;


public class pali{



    public static boolean palindrome(int i,String str){

        if(i>=str.length()/2) return true;

        if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;

        return palindrome(++i,str);

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean res=palindrome(0,str);

        if(res){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
}