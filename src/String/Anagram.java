package String;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s="rat";
        String t="car";
        System.out.println(anagram(s,t));
    }

    static boolean anagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }
            int n=map.get(ch);
            if(n>1){
                map.put(ch,map.get(ch)-1);
            }else{
                map.remove(ch);
            }
        }
        System.out.println(map);
        System.out.println(map.size());

        if(map.size()>0){
            return false;
        }else{
            return true;
        }
    }
}
