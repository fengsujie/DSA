package myArray;

public class Main {
    public static void main(String[] args) {
    myArray ob = new myArray(5);

    ob.insert(11);
    ob.insert(22);
    ob.insert(33);
    ob.insert(44);


    System.out.println(ob);

    System.out.println("Index of the value is : "+ob.indexOf(33));

    System.out.println(ob.removeAt(2));
    System.out.println("after removing the element : "+ob);

    System.out.println("Maximum value is : "+ob.max());

    System.out.println("Minimum value is : "+ob.min());
    ob.reverse();
    System.out.println("Reversed array : " +ob);


        ob.insert(55);
        ob.insert(66);
        ob.insert(77);
        ob.insert(88);

        System.out.println(ob);
    }
}
