package twoSum;

import java.util.HashMap;
import java.util.Map;

class tSum{
    public int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int targetNumber = target-arr[i];
            if(map.containsKey(targetNumber)){
                return new int[]{map.get(targetNumber),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}

public class twoSumOptimal {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target=9;
        tSum ob = new tSum();
        System.out.println(ob.twoSum(arr,target));
    }
}
