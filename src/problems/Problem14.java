package problems;

import java.util.Arrays;

public class Problem14 {
    //Move all the zeros to the end
    static void approach1(int[] arr) {

        int i = 0, j = 0;
        System.out.println(Arrays.toString(arr));

        while (j < arr.length) {
            if (arr[i] == 0) {
                int k = j + 1;
                while (k < arr.length && arr[k] == 0) {
                    k++;
                    if( k < arr.length && arr[k]!=0){
                        int tmp = arr[i];
                        arr[i] = arr[k];
                        arr[k] = tmp;
                        break;
                    }
                }

            }
            i++;
            j = i;
        }
        System.out.println(Arrays.toString(arr));

    }
    static void approach2(int[] arr){
        /*
        Traverse the array with one pointer i.
        When a non-zero element is found at i, move it to position j, and increment j.
        After the loop, all zeroes will naturally be at the end of the array.
         */
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void approach3(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                for(int j=0;j< arr.length;j++){
                        if(arr[j]==0){
                            int tmp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=tmp;
                        }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        approach3(new int[]{1,0,0,2,0,3,4,0,5});
    }
}
