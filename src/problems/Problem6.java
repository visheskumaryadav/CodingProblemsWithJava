package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
    /*
    Find the length of last word in the string
     */
   static void approach1(String str){
       //using string methods
       System.out.println(str);
       String[]strResult=str.replaceAll("\\s+"," ").trim().split(" ");
       System.out.println(strResult[strResult.length-1].length());
   }

   static void approach2(String str){
       //using iteration on each character
       List<String> stringResultList=new ArrayList<>();
       StringBuilder builder=new StringBuilder();
       int i=0;
       while(i<str.length()){

           if(str.charAt(i)==' '){
               if(!builder.isEmpty()){
                   stringResultList.add(builder.toString());
                   builder=new StringBuilder();
               }
           }else{
               builder.append(str.charAt(i));
           }
           i++;
       }
       System.out.println(stringResultList.get(stringResultList.size()-1).length());
   }
    public static void main(String[] args) {
        String str="     my     name   vishesh    ";
        approach1(str);
        approach2(str);

    }
}
