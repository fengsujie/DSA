package SpaceTimeComplexity;

public class Constant {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};


        // updating some value at specific index
        arr[4] = arr[4]+14; //constant time - o(1)

        System.out.println("Value at 4th index in array : "+arr[4]);


        // spacetime complexity refers to the additional space required
        int num = arr[3];   // integer is of 4 bytes which means O(4 bytes) - constant type complexity
        System.out.print(num);
    }
}
