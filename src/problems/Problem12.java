package problems;

public class Problem12 {
    //find the largest element in an array

    static void approach1(int[] arr){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("Largest element:"+largest);
    }

    public static void main(String[] args) {

    }
}
