import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class ArrayLists {
    public static void main(String[] args){
       ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList<String> list = new ArrayList<String>();

       // add 
       list.add(0);
       list.add(1);

       System.out.println(list);


       // get elements

       int element = list.get(0);
       System.out.println(element);

       // add elements in between

       list.add(1,2);
       System.out.println(list);


       // set elements phle se jo rakha ha usse change karge

       list.set(0,5);
       System.out.println(list);

       // delete elements

       list.remove(2);
       System.out.println(list);

       // size

       int size = list.size();
       System.out.println(size);

       // loops

       for(int i = 0; i < list.size(); i++){
        System.out.print(list.get(i));
       }
    System.out.println();

    // sorting 

    Collections.sort(list);
    System.out.println(list);

    }
}