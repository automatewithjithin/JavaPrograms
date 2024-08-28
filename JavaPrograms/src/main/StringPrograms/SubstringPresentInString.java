package StringPrograms;

import java.util.Arrays;

public class SubstringPresentInString {
    public static void main(String[] args) {
        //Check whether a substring present in a given string
        String words = "this is a sample string";
        String subword = "sample";
        String[] wordArray = words.split(" ");
        boolean flag=false;
        for(String word:wordArray){
            if (word.equals(subword)){
                flag=true;
                break;
            }

        }
        if(flag)
            System.out.println("Word present");
        else
            System.out.println("Word is not present");
    }
}
