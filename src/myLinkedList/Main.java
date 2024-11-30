package myLinkedList;

public class Main {
    public static void main(String[] args) {
        myLinkedList ob = new myLinkedList();
        ob.insert(11);
        ob.insert(22);
        ob.insert(33);
        ob.insert(44);
        ob.insert(55);


        ob.printList();

        System.out.println("Sum of all elements of linked list is : "+ob.sum());

        System.out.println("Index : "+ob.indexOf(55));

        ob.insertAtFirst(99);
        ob.insert(66);
        ob.printList();

        System.out.println("Inserting node at certain index : ");
        ob.insertAt(2,77);
        ob.printList();


        ob.reverse();
        System.out.println("Reverse linked list : ");
        ob.printList();

        ob.removeStart();
        System.out.println("Removing first element from linked list : ");
        ob.printList();

        ob.removeEnd();
        System.out.println("Removing last element from linked list : ");
        ob.printList();

        ob.removeNthFromEnd(2);
        System.out.println("After removing nth node");
        ob.printList();

    }
}
