package problems;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Problem24 {
    /*
    print unique characters from string
    input: “abbacdaab” output: abcd
     */

    static void approach1(String input){
        Set<Character> result=new LinkedHashSet<>();

        for(Character ch: input.toCharArray()){
            result.add(ch);
        }
        StringBuilder resultInString=new StringBuilder();
        for(Character ch:result){
            resultInString.append(ch);
        }
        System.out.println(resultInString.toString());
    }
    static void approach2(String input){
      char[] inputCharArray=input.toCharArray();
      List<Character> result=new ArrayList<>();

      for(char ch:inputCharArray){
          if(!result.contains(ch)){
              result.add(ch);
          }
      }
        System.out.println(result);
    }
    public static void main(String[] args) {
        approach1("abbacdaab");
        approach2("abbacdaab");
    }
}
