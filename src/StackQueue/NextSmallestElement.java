package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallestElement {
    public static void main(String[] args) {
        int[] arr={4,5,2,10,8};
        System.out.println(Arrays.toString(nextSmallest(arr)));
    }

    static int[] nextSmallest(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            while (!st.isEmpty() && st.peek()>=arr[i%n]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[j]=-1;
            }else{
                nge[j]=st.peek();
            }
            j++;
            st.push(arr[i]);
        }
        return nge;
    }
}
