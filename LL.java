import java.util.*;
class LL{
Node head;
private int size;
LL(){
    this.size = 0;
}
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add a new node to the first 

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    } 

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }

        System.out.println("NULL");
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args){
       LL list = new LL();
       list.addFirst("a");
       list.addFirst("is");
       list.printList();

       list.addLast("List");
       list.printList();

       list.addFirst("This");
       list.printList();

       list.deletefirst();
       list.printList();

        list.deleteLast();
       list.printList();

       System.out.println(list.getSize()); 
    }
}