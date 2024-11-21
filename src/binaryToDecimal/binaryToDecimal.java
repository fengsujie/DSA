package binaryToDecimal;

import java.util.Scanner;

class bToD{
    public int bToDe(int binary){
        int result = 0;
        int index = 0;
        while(binary!=0){
            int lastDigit = binary%10;
            if(lastDigit==1)
                result = result + (int) Math.pow(2,index);
            index = index+1;
            binary=binary/10;

        }
        return result;
    }

}

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter the decimal value : ");
        int binaryNumber = inputObject.nextInt();

        bToD classObject = new bToD();

        System.out.println(classObject.bToDe(binaryNumber));
    }
}
