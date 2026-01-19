package String;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s1="abc";
        String s2="xxz";

        System.out.println(isomorphic(s1,s2));
    }

    static boolean isomorphic(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();

        int i=0;
        while(i<s1.length()){
            map.put(s1.charAt(i),s2.charAt(i));
            i++;
        }

        StringBuilder sb=new StringBuilder();

        for(int j=0;j<s1.length();j++){
            sb.append(map.get(s1.charAt(j)));
        }

        System.out.println(sb);

        if(sb.toString().equals(s2)){
            return true;
        }

        return false;

    }
}
