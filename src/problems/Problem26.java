package problems;

public class Problem26 {
    /*
    Program to replace the vowels from a string with 'x'
     */
    static void approach1(String str){
        //using regex
        System.out.println(str.replaceAll("[aeiou]","x"));
    }
    static void approach2(String str){
        char[] chArr=str.toCharArray();
        for(int i=0;i<chArr.length;i++){
            if(chArr[i]=='a' || chArr[i]=='u'||chArr[i]=='o'||chArr[i]=='i'||chArr[i]=='e'){
                chArr[i]='x';
            }
        }
        System.out.println(String.valueOf(chArr));
    }
    public static void main(String[] args) {
        approach1("hello world its good");
        approach2("hello world its good");
    }
}
