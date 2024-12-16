package StringPrograms;

public class CountSpecificLetterInString {
    public static void main(String[] args) {
        String input = "This is a sample string and another string";
        countSpecificLetterInString(input,'a');
    }

    private static void countSpecificLetterInString(String input ,char letter) {
        char[]inputArray = input.toCharArray();
        int count=0;
        for(char c :inputArray){
            if(c==letter){
                count++;
            }
        }
        System.out.println("The total count is "+count);
    }
}
