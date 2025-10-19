import java.util.*;



class prime{

    public static void chkprime(int n){
        int flag=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
            }

        }

        if(flag==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("NOt Prime");
        }
    }
    

    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        chkprime(n);
    }
}