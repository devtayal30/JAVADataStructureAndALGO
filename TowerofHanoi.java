import java.util.*;
class TowerofHanoi{
    public static void toh(int n , String src, String helper, String dest){
      if (n == 1){
        System.out.println("transferdisk " + n + " from " + src + " to " + dest);
        return;
      }
      toh(n-1 , src , dest, helper);
      System.out.println("transferdisk "+ n + " from " + src + " to " + dest);
      toh(n-1, helper,src,dest);

    }
    public static void main(String[] args){
       int n = 3;
       toh(n , "S", "H" , "D");
    }
}