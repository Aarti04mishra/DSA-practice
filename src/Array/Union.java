package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};

    }

    static ArrayList<Integer> union(int[] arr1, int[] arr2){
        int i=0;
        int j=0;
        ArrayList<Integer> num=new ArrayList<>();

        while(i!=arr1.length || j!=arr2.length){
            if(arr1[i]<=arr2[i]){
                if(num.size()==0||num.getLast()!=arr1[i]){
                    num.add(arr1[i]);
                }
                i++;
            }else{
                if(num.size()==0||num.getLast()!=arr2[j]){
                    num.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<arr1.length){
            if(num.size()==0||num.getLast()!=arr1[i]){
                num.add(arr1[i]);
            }
            i++;
        }

        while (j<arr2.length){
            if(num.size()==0||num.getLast()!=arr2[j]){
                num.add(arr2[j]);
            }
            j++;
        }

        return num;
    }
}
