package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};

        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }

    static int[] intersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }

        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                num.add(arr2[i]);
                if(map.get(arr2[i])>1){
                    map.put(arr2[i],map.get(arr2[i])-1);
                }else{
                    map.remove(arr2[i]);
                }
            }
        }
        int[] ans=new int[num.size()];
        int i=0;
        for(int n:num){
            ans[i]=n;
            i++;
        }

        return ans;

    }
}
