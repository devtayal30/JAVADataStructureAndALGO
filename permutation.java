import java.util.*;
class permutation{
    public static void printperm(String str, String permutation, int idx){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printperm(newstr, permutation+curr,idx+1);
        }
    }
    public static void main(String[] args){
       String str = "abc";
       printperm(str, "", 0);
    }
}