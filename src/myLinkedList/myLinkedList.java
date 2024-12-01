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

    public void insertAt(int index, int value){
        if(isEmpty()) throw new IllegalArgumentException();
        Node node = new Node(value);
        Node current = head;
        Node prev = null;

        while(index>0 && current !=null){
            prev=current;
            current=current.next;
            index--;
        }
        prev.next=node;
        node.next=current;
    }

    public void reverse(){
        if(head ==null || head.next==null) return;

        Node prev= null;
        Node current = head;
        Node next = head.next;

        while(next!=null){
            current.next = prev;
            prev=current;
            current=next;
            next=next.next;
        }

        head=current;
        current.next=prev;
    }

//    deleting node from the beginning
    public void removeStart(){
        if(isEmpty()) return;

        Node temp=head;
        head=head.next;
        temp.next=null;
    }

//    removing node from the last
public void removeEnd() {
    if (isEmpty()) {
        System.out.println("The list is already empty.");
        return;
    }
    if (head == tail) {
        head = tail = null;
        return;
    }
    Node current = head;
    while (current != null && current.next != null && current.next != tail) {
        current = current.next;
    }
    if (current != null) {
        current.next = null;
        tail = current;
    }
}

// removing from nth end
    public void removeNthFromEnd(int n){
        if(head.next == null){
            head=null;
            return;
        }

        int totalNodes=0;
        Node current=head;
        while (current!=null){
            totalNodes++;
            current=current.next;
        }

        int indexFromFront = totalNodes-n+1;

        Node prev = null;
        current=head;
        while(indexFromFront>1 && current!=null){
            prev=current;
            current=current.next;
            indexFromFront--;
        }

        prev.next=current.next;
        current.next=null;
}

// swapping nodes in pairs
public Node swapPairs(Node head) {
    if(head==null || head.next==null) return head;

    Node rest = swapPairs(head.next.next);
    Node second = head.next;
    second.next=head;
    head.next=rest;
    return second;
}
}

