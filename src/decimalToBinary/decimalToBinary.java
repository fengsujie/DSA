package decimalToBinary;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter the decimal value : ");
        int decimalNumber = inputObject.nextInt();
        System.out.println("decimal value : "+decimalNumber);
        int rem;
        String binaryValue = "";
        while(decimalNumber>0){
            rem = decimalNumber%2;
            decimalNumber = decimalNumber/2;
            binaryValue = rem + binaryValue;
        }
        System.out.println("binary value : "+binaryValue);
    }
}
