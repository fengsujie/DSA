package factorial_usingRecursion;
import java.util.Scanner;

class facto{
    public static int fact(int num){
        if(num==1) return 1;
        return num*fact(num-1);
    }
}

public class factorial {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = ob.nextInt();

//        calling the recursion function using that class object
        facto classOb = new facto();

        System.out.println(classOb.fact(num));
    }
}
