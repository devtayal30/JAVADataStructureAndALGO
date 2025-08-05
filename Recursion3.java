import java.util.*;
class Recursion3{
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1 = fact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
       int n = 2;
       int ans = fact(n);
       System.out.println(ans);
    }
}