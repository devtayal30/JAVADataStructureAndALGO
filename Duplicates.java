import java.util.*;
class Duplicates{
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
        }

        char curr = str.charAt(idx);
        if(map[curr - 'a']){
           removeDuplicates(str, idx + 1, newString);
        } else {
            newString += curr;
            map[curr - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args){
       String str = "abaacdc";
       removeDuplicates(str,0,"");
    }
}