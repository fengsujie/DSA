package singleNumber_leetcode136;

class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num: nums){
            result = result ^ num;
        }
        return result;
    }
}
public class singleNumberOptimal {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1};
        Solution ob = new Solution();
        System.out.println(ob.singleNumber(arr));
    }

}
