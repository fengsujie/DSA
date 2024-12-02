package myStack;

public class Main {
    public static void main(String[] args) {
        ms stack = new ms(5);
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);

        System.out.println(stack);
    }
}
