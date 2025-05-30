package problems;

import java.util.*;

public class Problem21 {
    /*
    Find the max quantity:
we have a string array str arr[]={”xyz 9”, “abc 20”, “xyz 21”} →  xyz is product and 9 is qty
o/p should be 30 as xyz has max no. of qty
     */
    static void approach1(String[] arr){
    Map<String,Integer> map=new HashMap<>();

    for(String element:arr){
       String[] productAndQty= element.split(" ");
       if(map.containsKey(productAndQty[0])){
           map.put(productAndQty[0],map.get(productAndQty[0])+Integer.parseInt(productAndQty[1].trim()));
       }else{
           map.put(productAndQty[0],Integer.parseInt(productAndQty[1]));
       }
    }
    int max= Integer.MIN_VALUE;
    StringBuilder productName=new StringBuilder();
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for(Map.Entry<String,Integer> entry:entries){
        if(entry.getValue()>max){
            max=entry.getValue();
            productName=new StringBuilder(entry.getKey());
        }
    }
        System.out.println(productName+"-"+max);


    }
    public static void main(String[] args) {
        approach1(new String[]{"xyz 9","abc 20", "xyz 21"});
    }
}
