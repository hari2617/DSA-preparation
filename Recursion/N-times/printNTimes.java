import java.util.*;


class printNTimes{


    public static void printName(int st,int sp){
        if(st==sp)
        return;
        System.out.println("Hari ");
        st++;
        printName(st,sp);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printName(0,n);
    }
}