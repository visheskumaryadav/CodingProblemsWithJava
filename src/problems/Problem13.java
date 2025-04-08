package problems;

import java.util.Arrays;

public class Problem13 {
    //Reverse an Array
    static void approach1(int[] arr){
        int  leftPointer=0;int rightPointer=arr.length-1;
        while(leftPointer<rightPointer){
            int tmp=arr[leftPointer];
            arr[leftPointer]=arr[rightPointer];
            arr[rightPointer]=tmp;
            leftPointer++;rightPointer--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        approach1(new int[]{1,2,3,4,5,6,7,8,9});
    }


}
