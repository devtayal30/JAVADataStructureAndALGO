import java.util.*;
class RecursivereverseLL{
Node head;
private int size;
RecursivereverseLL(){
    this.size = 0;
}
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add a new node to the first 

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    } 

    public void addLast(int data){
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

    public Node reverserecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverserecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }
    
    public static void main(String[] args){
        
        RecursivereverseLL list = new RecursivereverseLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();

        list.head = list.reverserecursive(list.head);
        list.printList();

    }
       
    }