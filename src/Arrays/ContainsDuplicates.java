package Arrays;
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
         int[] nums={1,2,3,1};
        System.out.println(containsDuplicates(nums));
    }

    static boolean containsDuplicates(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return true;
            }
        }

        return false;
    }
}
