package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem10 {
    //Find the missing number from the array

    static void approach1(int[] arr){
        //using mathematical formula
        Arrays.sort(arr);
        int expectedSumOfArray=(arr[arr.length-1]*(arr[arr.length-1]+1))/2;
//        System.out.println(expectedSumOfArray);
        int actualSumOfArray=0;
        for(int e:arr){
            actualSumOfArray+=e;
        }
        System.out.println("Missing number:"+(expectedSumOfArray-actualSumOfArray));
    }
    static void approach2(int[] arr){
        //using xor operator
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result^=arr[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        approach2(new int[]{1,2,3,4,5,7});
    }
}
