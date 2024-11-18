package quadratic;
import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        int[] pairArray = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.print("Enter the target : ");
        int target = inputObject.nextInt();
        System.out.print("\n");

        for(int i=0;i<pairArray.length;i++){
            for (int j=i+1;j<pairArray.length;j++){
                if(pairArray[i]+pairArray[j]==target){
                    System.out.println("Pair sum : ["+pairArray[i]+" , "+pairArray[j]+"]");
                }
            }
        }
    }
}
