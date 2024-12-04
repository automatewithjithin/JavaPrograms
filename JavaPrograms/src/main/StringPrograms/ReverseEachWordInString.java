package StringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        //Reverse each word in a string without reversing the whole string
        // try coding - yrt gnidoc
        String input = "try coding";
        String output = "";
        String[] inputArray = input.split(" ");
        for (String word : inputArray) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            output += sb + " ";
        }
        System.out.println(output);
    }
}
