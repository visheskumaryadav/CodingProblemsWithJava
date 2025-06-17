package problems;

public class Problem27 {
    /*
    Find the 1st and last occurrence of a character in the string
     */

    static void approach1(String str,char x){
        int firstOccurrance=-1;int lastOccurrance=-1;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==x ){
                if(firstOccurrance==-1){
                    firstOccurrance=i+1;
                }
                lastOccurrance=i+1;
            }
        }
        System.out.println("1st occurrence:"+firstOccurrance);
        System.out.println("Last occurrence:"+lastOccurrance);
    }
    static void approach2(String str){
        }
    public static void main(String[] args) {
        approach1("Vishesh",'h');
//        approach2("hello world its good");
    }
}
