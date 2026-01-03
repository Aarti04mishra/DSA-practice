package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlapping {
    public static void main(String[] args) {
        int[][] arr={{4,7},{1,4}};

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        int [][] ans=mergeOverlapping(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }

    static int[][] mergeOverlapping(int[][] arr){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             Integer start=arr[i][0];
             Integer end=arr[i][1];



             if(!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)){
                 continue;
             }

             for(int j=i+1;j<arr.length;j++) {
                 if (arr[j][0] <= end) {
                     end = Math.max(end, arr[j][1]);
                 } else {
                     break;
                 }
             }
             ArrayList<Integer> num=new ArrayList<>();
             num.addAll(Arrays.asList(start,end));
             ans.add(num);
         }

        int rows = ans.size();
        int cols = ans.get(0).size();

        int[][] a = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = ans.get(i).get(j);
            }
        }

         return a;
    }
}
