package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem28 {
    /*
    calculate the sum of numbers from string
     */
    static void approach1(String input){
        Pattern compile = Pattern.compile("\\d+");
        Matcher matcher = compile.matcher(input);
        int sum=0;
        while (matcher.find()){
//            System.out.println(matcher.group());
            sum+=Integer.parseInt(matcher.group());
        }
        System.out.println("sum="+sum);
    }
    static void approach2(String input){
        char[] inputArray=input.toCharArray();
        List<Integer> nums=new ArrayList<>();
        int num=0;
        for(int i=0;i<inputArray.length;i++){
           if(Character.isDigit(inputArray[i])){
               num=10*num+(inputArray[i]-'0');
           }else{
               //need to work on approach2
           }
        }
    }
    public static void main(String[] args) {
        approach1("hello43 4554 hn39 28hun");
    }

}
