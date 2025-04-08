package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem17 {
    /*
    Count frequency of characters
     */
    static void approach1(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(char c:str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        System.out.println(map);
    }

    static void approach2(String str){
        //without hashmap
        int[] frequencyArr=new int[256];
        for(char ch:str.toCharArray()){
            frequencyArr[ch]++;
        }
        for(int i=0;i<frequencyArr.length;i++){
            if(frequencyArr[i]>0){
                System.out.print((char)i+":"+frequencyArr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        approach1("madam");
        approach2("madam");
    }
}
