package String;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";

        System.out.println(wordPattern(pattern,s));
    }

    static boolean wordPattern(String pattern, String s){
        String[] words=s.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }

        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();

        for(int i=0;i<words.length;i++){
            if(map1.containsKey(pattern.charAt(i)) && !map1.get(pattern.charAt(i)).equals(words[i])){
                return false;

            }
            map1.put(pattern.charAt(i),words[i]);


            if(map2.containsKey(words[i]) && map2.get(words[i])!=pattern.charAt(i)){
                return false;
            }
            map2.put(words[i],pattern.charAt(i));


        }

        return true;
    }
}
