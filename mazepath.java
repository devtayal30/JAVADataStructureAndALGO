import java.util.*;
class mazepath{
    public static int path(int i, int j, int n, int m){
       if(i==n || j==m){
        return 0;
       }
       if(i==n-1 || j==m-1){
        return 1;
       }

        int downpaths = path(i+1, j, n, m);

        int rightpaths = path(i, j+1, n, m);

        return downpaths + rightpaths;
    }
    public static void main(String[] args){
       
       int n=3; int m =3;
       int ans = path(0,0,n,m);
       System.out.println(ans);
    }
}