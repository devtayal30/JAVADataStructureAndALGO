import java.util.*;
class Recursion5{
    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }

        // int powxm1 = power(x, n-1);
        // int powx = x * powxm1;
        // return (powx);

        if(n%2 == 0){
            return power(x,n/2) * power(x,n/2);
        }
        else{
            return power(x,n/2) * power(x,n/2) * x;
        }
    }
    public static void main(String[] args){
       int x= 2 , n = 5;
       int ans = power(x,n);
       System.out.println(ans);
    }
}