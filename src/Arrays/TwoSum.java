package Arrays;
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,-5};
        int target=-8;

        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] sum={-1,-1};

        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];

            if(!map.containsKey(rem)){
                map.put(nums[i],i);
            }else{
                sum[1]=i;
                sum[0]=map.get(rem);
                break;
            }

        }

        return sum;
    }


}
