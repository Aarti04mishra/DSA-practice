package Array;

import java.util.HashMap;

public class LongestSubSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,3,5,2,8,2,2,2,2,2};
        int k=10;
        System.out.println(longestSubSum(arr,k));
    }

    static int longestSubSum(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLen=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
               maxLen=Math.max(maxLen,i+1);
            }
            int rem=sum-k;
            if(!map.isEmpty() && map.containsKey(rem)){
               maxLen=Math.max(maxLen,i-map.get(rem));

            }

            map.put(sum,i);
        }

        return maxLen;
    }
}
