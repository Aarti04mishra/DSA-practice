package Array;

import java.util.HashMap;

public class SubarraysWithXORK {
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int k=6;
        System.out.println(subarraysNum(arr,k));
    }

    static int subarraysNum(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int xr=0;
        for(int i=0;i<arr.length;i++){
            xr=arr[i]^xr;
            int n=xr^k;
            if(map.containsKey(n)){
                count+=map.get(n);
            }else{
                map.put(n,map.getOrDefault(n,1)+1);
            }
        }

        return count;
    }
}
