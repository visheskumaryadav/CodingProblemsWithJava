package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {
    /*
    Find the only unique elements inside the array without any collection:
ex. int a[]={1,2,3,1,2}
     */
    static void approach1(int[] arr){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<arr.length;j++){

                if(arr[i]==arr[j] && i!=j){
                    isDuplicate=true;break;
                }

            }
            if(!isDuplicate){
                result.add(arr[i]);
            }
        }

        System.out.println(result);
    }

    static void approach2(int[] arr){
        /*
        This only works when:
        Every number appears exactly twice
        One number appears once
         */
        int result =0;
        for(int a:arr){
            result^=a;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        approach1(new int[]{1,2,3,1,2});
        approach2(new int[]{1,2,3,1,2});
    }
}
