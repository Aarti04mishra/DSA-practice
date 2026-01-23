package String;

import java.util.HashMap;

public class LongestSubstrWithKUniques {
    public static void main(String[] args) {
        String s="aabbccd";
        int k=3;

        System.out.println(kUniques(s,k));
    }

    static int kUniques(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int len=0;

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

            len=Math.max(len,right-left+1);
            right++;
        }

        return len;
    }
}
