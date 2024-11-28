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

    public myLinkedList(){
        head=null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
        }
        else{
            Node current = head;
            while(current.next != null){
                current=current.next;
            }
            current.next=node;

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
}
