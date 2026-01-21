package String;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s="cccaaa";
        System.out.println(sortCharacters(s));
    }

    static String sortCharacters(String s){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>();

        for(int key:map.keySet()){
            pq.offer(new int[]{map.get(key),key});
        }

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            sb.append(pq.poll()[1]);
        }

        return sb.toString();
    }
}
