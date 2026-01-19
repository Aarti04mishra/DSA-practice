package Array;

import java.util.*;

public class KFrequentElements {
    public static void main(String[] args) {
        int[] arr={7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k=4;
        System.out.println(Arrays.toString(topKFrequent2(arr,k)));
//        System.out.println(Arrays.toString(topKFrequent(arr,k)));
    }

    static int[] topKFrequent2(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]   // min-heap by frequency
        );

        for (int key : map.keySet()) {
            pq.offer(new int[]{map.get(key), key});

            if (pq.size() > k) {
                pq.poll(); // remove least frequent
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll()[1];
        }

        return res;
    }

    static int[] topKFrequent(int[] arr,int k){
        ArrayList<int[]> num=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int n:map.keySet()){
            int[] ans=new int[2];
            ans[0]=map.get(n);
            ans[1]=n;
            num.add(ans);
        }

        Collections.sort(num, (a, b) -> Integer.compare(b[0], a[0]));


        int[] nums=new int[k];
        int i=0;

        for(int j=0;j<k;j++){
            nums[i]=num.get(j)[1];
            i++;
        }


        return nums;

    }
}
