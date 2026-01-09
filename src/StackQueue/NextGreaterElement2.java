package StackQueue;


import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreater(arr)));

    }

    static int[] nextGreater(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[arr.length];
        int j=0;
        for(int i=2*n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();
            }

            if(i<n){
                nge[j]=st.isEmpty()?-1:st.peek();
                j++;
            }

            st.push(arr[i%n]);
        }
        reverse(nge);
        return nge;
    }

    static void reverse(int[] arr){
        int first=0;
        int last=arr.length-1;

        while(first<=last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }
}
