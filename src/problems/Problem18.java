package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem18 {
    /*
    count the frequency of special characters
     */

    static void approach1(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(char c:str.toCharArray()){
            if(!((c>='a' && c<='z')||(c>='A' && c<='Z')||(c==' ')||(c>='0' && c<='9'))){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }

        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        approach1("str#@!%@#");
    }
}
