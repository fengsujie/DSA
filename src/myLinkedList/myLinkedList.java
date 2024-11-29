package myLinkedList;

class Node{
    public int data;
    public Node next = null;

    public Node(int data){
        this.data=data;
    }
}

public class myLinkedList {
    public Node head;
    public Node tail;

    public myLinkedList(){
        head=null;
        tail=null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head=tail=node;

        }
        else{
           tail.next=node;
           tail=node;

        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("-->");
            }
            current = current.next;
        }
        System.out.println();
    }

//    traversing through linked list
//    for summation
    public int sum(){
        Node current = head;
        int sum =0;
        while(current != null){
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

//    there's nothing like indexing in linked list
    public int indexOf(int value){
        int index=0;
        Node current = head;
        while(current!=null){
            if(current.data == value){
                return index;
            }
            index++;
            current=current.next;
        }
        return -1;
    }

//    inserting node in the beginning of the linked list
    public void insertAtFirst(int value){
        Node node = new Node(value);
        if(head==null){
            head=tail=node;
            return;
        }
        node.next = head;
        head=node;
    }

//    isEmpty function to avoid the repetition of checking whether the linked list is empty or not
    public boolean isEmpty(){
        return head==null && tail==null;
    }
}
