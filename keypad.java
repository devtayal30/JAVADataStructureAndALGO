import java.util.*;
class keypad{
    public static String[] keypad= {".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void combination(String str , int idx, String NewCombination){

    if(idx == str.length()){
        System.out.println(NewCombination);
        return;
    }

    char curr = str.charAt(idx);
    String mapping = keypad[curr -'0'];
    for(int i = 0; i < mapping.length(); i++){
    combination(str , idx+1, NewCombination+mapping.charAt(i));
    }
    }
    public static void main(String[] args){
       String str = "23";
       combination(str,0,"");
    }
}