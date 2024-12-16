package StringPrograms;

import java.util.Arrays;

public class SubstringPresentInString {
    public static void main(String[] args) {
        //Check whether a substring present in a given string
        String words = "this is a sample string";
        String subword = "sample";
        Boolean flag = checkSubstringPresent(words,subword);
        Boolean flagStreamMethod = checkSubstringPresentUsingStreams(words,subword);

        if(flag&&flagStreamMethod)
            System.out.println("Word present");
        else
            System.out.println("Word is not present");
    }

    private static Boolean checkSubstringPresentUsingStreams(String words, String subword) {
        return Arrays.stream(words.split(" ")).anyMatch(data->data.equals(subword));
    }

    private static Boolean checkSubstringPresent(String words, String subword) {
        String[] wordArray = words.split(" ");
        boolean flag=false;
        for(String word:wordArray){
            if (word.equals(subword)){
                flag=true;
                break;
            }

        }
        return flag;
    }
}
