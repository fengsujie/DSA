package myArray;

class lSearch{
    public int linearSearch(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            value = i;
            if(i==arr[i+1]){
                break;
            }
        }

        return value;
    }
}
public class singleNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2};
        lSearch ob = new lSearch();

        for(int i=0;i<arr.length;i++){
            System.out.println(ob.linearSearch(arr,i));
        }
    }
}
