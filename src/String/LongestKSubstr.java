package String;

import java.util.HashMap;

public class LongestKSubstr {
    public static void main(String[] args) {
        String s="aaaa";
        int k=2;

        System.out.println(longestKSubstr(s,k));
    }

    static int longestKSubstr(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxLen=-1;

        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            if(map.size()>k){
                while(map.size()>k){
                    if(map.get(s.charAt(left))==1){
                        map.remove(s.charAt(left));
                    }else{
                        map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    }

                    left++;
                }

            }

            if(map.size()==k){
                maxLen=Math.max(maxLen,right-left+1);
            }

            right++;
        }

        return maxLen;
    }
}
