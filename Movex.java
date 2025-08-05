import java.util.*;
class Movex{
    public static void moveallx(String str, int idx, int count , String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            moveallx(str, idx+1, count, newString);
        }
        else{
              newString += curr;
              moveallx(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args){
       String str = "abxdxfbxh";
       moveallx(str, 0,0," ");
    }
}