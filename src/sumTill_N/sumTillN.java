package sumTill_N;
import java.util.Scanner;

class Summation {
    public int sum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sum(num - 1);
    }
}

public class sumTillN {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = inp.nextInt();

        // Create an object of the Summation class
        Summation ob = new Summation();

        System.out.println("Sum of numbers till " + num + " is: " + ob.sum(num));
    }
}
