package StackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        System.out.println(nextGreater(arr));
    }

    static List<Integer> nextGreater(int[] arr){
        Stack<Integer> st=new Stack<>();
        List<Integer> num=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                num.add(-1);
            }else if(st.peek()>arr[i]){
                num.add(st.peek());

            }else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    num.add(st.peek());
                }else{
                    num.add(-1);
                }
            }
            st.push(arr[i]);
        }

        return num.reversed();
    }
}
