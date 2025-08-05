import java.util.*;
class Subsequences {
    public static void Subsequence(String str , int idx, String newString){
        
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);

        Subsequence(str, idx+1, newString+curr);

        Subsequence(str, idx+1, newString);
    }
    public static void main(String[] args){
       String str = "abc";
       Subsequence(str,0,"");
    }
}