package problems;

import java.util.*;

public class Problem23 {
    static void approach1(int[] arr){
        Map<Integer,Integer> result=new HashMap<>();
        for(int a:arr){
            result.put(a,result.getOrDefault(a,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:result.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }

    }
    static void approach2(int[] arr){

        List<Integer> seeOnce=new ArrayList<>();
        List<Integer> seeMoreThanOnce=new ArrayList<>();

        for(Integer a:arr){

            if(seeMoreThanOnce.contains(a)){
                continue;
            }else if (seeOnce.contains(a)){
                seeOnce.remove(a);
                seeMoreThanOnce.add(a);
            }else{
                seeOnce.add(a);
            }
        }
        System.out.println(seeOnce);
    }
    public static void main(String[] args) {
        approach1(new int[]{1,2,3,1,2});
        approach2(new int[]{1,2,3,1,2});
    }
}
