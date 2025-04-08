package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem16 {
    /*
    max length of consecutive ones
    {1, 1, 0, 1, 1, 1}
    16,17,4,3,5,2,1
     */
    static void approach1(int[] arr){
        int maxLengthOfOnes= 0;
        for(int i=0;i<arr.length;i++){
           int j=i+1;
           if(arr[i]==1){
               while(j<arr.length){
                   if(arr[j]!=1){
                       break;
                   }
                   j++;
               }
               if((j-i)>maxLengthOfOnes){
                   maxLengthOfOnes=j-i;
               }
           }




        }
        System.out.println("max length:"+maxLengthOfOnes);
    }

    static void approach2(int[] arr){
        List<Integer> list=new ArrayList<>();
        boolean status=false;int maxLength=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                status=true;
                list.add(arr[i]);
            }else{
                if(status){
                    if(maxLength<list.size()){
                        maxLength=list.size();
                    }
                    list.clear();
                    status=false;
                }
            }

        }
        if(status){
            if(maxLength<list.size()){
                maxLength=list.size();
            }
            list.clear();
            status=false;
        }
        System.out.println("Max length="+maxLength);
    }
    static void approach3(int[] arr){
        int maxOneCounter=0;int currentOneCounter=0;

        for(int e:arr){
            if(e==1){
                currentOneCounter++;
                maxOneCounter=Math.max(maxOneCounter,currentOneCounter);
            }else{
                currentOneCounter=0;
            }
        }
        System.out.println("Max lenght:"+maxOneCounter);
    }
    public static void main(String[] args) {

    approach3(new int[]{1, 0, 1, 1, 0, 1,1,1} );
        approach3(new int[]{0, 0, 0,0,0} );

    }


}
