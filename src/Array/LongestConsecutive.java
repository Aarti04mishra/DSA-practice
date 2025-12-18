package Array;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr={5,8,3,2,1,4,9,10,11,12,13,14};
        System.out.println(longestCons(arr));

    }

    static int longestCons(int[] arr){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int longest=1;

        for(Integer value:set){
            if(set.contains(value+1)){
               int count=1;
               int x=value;
               while(set.contains(x+1)){
                   x=x+1;
                   count++;
               }

               longest=Math.max(longest,count);
            }
        }

        return longest;
    }
}
