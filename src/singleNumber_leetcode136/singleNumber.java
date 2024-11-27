package singleNumber_leetcode136;

class lSearch{
    public int linearSearch(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=-1 && i!=j){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1) return arr[i];
        }
        return -1;
    }
}

public class singleNumber {
    public static void main(String[] args) {

        int[] arr = new int[]{2,2,1};
    lSearch ob = new lSearch();
    System.out.println(ob.linearSearch(arr));
    }
}
