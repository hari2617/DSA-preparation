import java.util.*;


class rev{
    public int ver(int n){
        int revNum=0;
        while(n!=0){
            int num=n%10;
            revNum=revNum*10+num;
            n/=10;
        }
        return revNum;
    }
}


class reverseNum{

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        rev r=new rev();
        System.out.println(r.ver(n));
    }
}