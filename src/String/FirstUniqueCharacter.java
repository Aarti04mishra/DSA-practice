package String;

import java.util.Arrays;
import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s="loveleetcode";

        System.out.println(firstUniqueCharacter(s));
    }

    static int firstUniqueCharacter(String s){
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }

        return -1;
    }
}
