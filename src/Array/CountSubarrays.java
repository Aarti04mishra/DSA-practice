package Array;

import java.util.HashMap;

public class CountSubarrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(countSubarrays(arr,3));
    }

    static int countSubarrays(int[] arr,int k){
        int preSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(map.containsKey(preSum-k)){
                count+=map.get(preSum-k);
            }

            map.put(preSum, map.getOrDefault(preSum,0)+1);
        }

        return count;

    }
}
