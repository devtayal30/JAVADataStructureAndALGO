import java.util.*;
class Tiles{

    public static int placetiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        int verticalplace = placetiles(n-m, m);
        int horizontalplace = placetiles(n-1,m);

        return verticalplace + horizontalplace;
    }
    public static void main(String[] args){
       int n = 4, m = 2;
       int totalplace = placetiles(n,m);
       System.out.println(totalplace);
    }
}