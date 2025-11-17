package Arrays;
//Input: nums = [3,2,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2.
//The third distinct maximum is 1.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ThirdMaxElement {
    public static void main(String[] args) {
        int[] nums={1,2147483647,-2147483648};

        System.out.println(thirdMaxElement(nums));
    }

    static int thirdMaxElement(int[] nums){
        TreeSet<Integer> tree=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            tree.add(nums[i]);
        }

        List<Integer> arr=new ArrayList<>();
        for(int num:tree){
            arr.add(num);
        }
        System.out.println(arr);
        if(arr.size()>=3){
            return arr.get(arr.size()-3);
        }else{
            return arr.get(arr.size()-1);
        }
    }

    static int thirdMaxElement1(int[] nums){
        Long max1=null, max2=null, max3=null;

        for(Integer n:nums){
            if(n.equals(max1)|| n.equals(max2) || n.equals(max3)){
                continue;
            }

            if(max1==null || n>max1){
                max3=max2;
                max2=max1;
                max1=Long.valueOf(n);
            }else if(max2==null || n>max2){
                max3=max2;
                max2=Long.valueOf(n);
            }else if(max3==null|| n>max3){
                max3=Long.valueOf(n);
            }
        }

        return max3==null?max1.intValue():max3.intValue();
    }
}
