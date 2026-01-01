package Array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
//        System.out.println(threeSum(arr));
        System.out.println(threeSum2(arr));
    }

    //Better - O(n^2)
    static ArrayList<ArrayList<Integer>> threeSum(int[] arr){
        HashSet<ArrayList<Integer>> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            HashSet<Integer> st=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                if(st.contains(-(arr[i]+arr[j]))){
                    ArrayList<Integer> ans= new ArrayList<>();
                    ans.addAll(Arrays.asList(arr[i],arr[j],-(arr[i]+arr[j])));
                    Collections.sort(ans);
                    set.add(ans);
                }
                st.add(arr[j]);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>(set);
        return result;
    }

    //Optimal
    static ArrayList<ArrayList<Integer>> threeSum2(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        for(int i = 0; i < arr.length - 2; i++){
            if(i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = arr.length - 1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j - 1]) j++;
                    while(j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return result;
    }
}
