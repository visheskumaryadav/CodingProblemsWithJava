package problems;

public class Problem29 {
    /*
    count lowercase and uppercase characters in a string
     */
    static void approach1(String input){
        int lowercaseCharactersCount=0;
        int uppercaseCharactersCount=0;
        char[] inputArray=input.toCharArray();
        for(int i=0;i<inputArray.length;i++){
            if(Character.isUpperCase(inputArray[i])){
                uppercaseCharactersCount++;
            }else if(Character.isLowerCase(inputArray[i])){
                lowercaseCharactersCount++;
            }

        }
        
        System.out.println("Uppercase character="+uppercaseCharactersCount+"\n"+"lowercase character="+lowercaseCharactersCount);
    }

    public static void main(String[] args) {
        approach1("Hello There iAM");
    }
}
