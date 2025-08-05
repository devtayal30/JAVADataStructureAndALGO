import java.util.*;
import java.util.HashSet;
class uniquesubsequence {
    public static void Subsequence(String str , int idx, String newString,HashSet<String>set){
        
        if(idx == str.length()){
           if(set.contains(newString)){
            return;
           } else{
            System.out.println(newString);
            set.add(newString);
            return;
           }
        }
        char curr = str.charAt(idx);

        Subsequence(str, idx+1, newString+curr,set);

        Subsequence(str, idx+1, newString,set);
    }
    public static void main(String[] args){
       String str = "aaa";
       HashSet<String> set = new HashSet<>();
       Subsequence(str,0,"",set);
    }
}