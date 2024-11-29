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
    }
}
