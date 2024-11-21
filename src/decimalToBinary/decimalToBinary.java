package decimalToBinary;
import java.util.Scanner;

class dToB{
    public String dToBe(int decimal){
        String result = " ";
        while(decimal!=0){
            int lastBit = decimal & 1;
            result = lastBit + result;
            decimal = decimal>>1;
        }
        return result;
    }
}

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter the decimal value : ");
        int decimalNumber = inputObject.nextInt();

//        old method
//        System.out.println("decimal value : "+decimalNumber);
//        int rem;
//        String binaryValue = "";
//        while(decimalNumber>0){
//            rem = decimalNumber%2;
//            decimalNumber = decimalNumber/2;
//            binaryValue = rem + binaryValue;
//        }
//        System.out.println("binary value : "+binaryValue);


//        new method
    dToB classObject = new dToB();
    System.out.println(classObject.dToBe(decimalNumber));
    }
}
