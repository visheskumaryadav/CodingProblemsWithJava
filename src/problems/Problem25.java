package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem25 {
    /*
    Leader in array - a number and that number should be largest to all the number to its right
    int[] arr={16,17,4,3,5,2} output- 17,5,2
     */
    static void approach1(int[] input){

        for(int i=0;i<input.length;i++){
            boolean isLeader=true;
            for(int j=i+1;j< input.length;j++){
                if(input[i]<input[j]){
                    isLeader=false;
                }
            }
            if(isLeader){
                System.out.println(input[i]);
            }
        }
    }

    static void approach2(int[] input){
        List<Integer> result=new ArrayList<>();
        result.add(input[input.length-1]);
        int leader=input[input.length-1];
        for(int i=input.length-2;i>=0;i--){
            if(leader<input[i]){
                leader=input[i];
                result.add(leader);
            }
        }
        Collections.reverse(result);
        System.out.println(result);
    }
    public static void main(String[] args) {
        approach1(new int[]{16,17,4,3,5,2});
        approach2(new int[]{16,17,4,3,5,2});

    }
}
