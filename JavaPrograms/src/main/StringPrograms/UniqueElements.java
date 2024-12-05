package StringPrograms;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        /*WAP to fetch unique elements in string (Non repeating characters)
            1. Without using Collections
            2. With using collections
            input: this is sample
            output: thample
         */

        String input = "this is sample";
        //using collections
        uniqueElementsWithCollections(input);
        System.out.println();
        uniqueElementsWithoutCollection(input);
    }

    private static void uniqueElementsWithoutCollection(String input) {
        boolean flag = true;
        String temp = "";
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (inputArray[i] == inputArray[j]) {
                    flag = false; //duplicate found at jth position.
                    inputArray[j] = '\0'; /*making the value of duplicate element position (j) null so that
                    i loop will not take the letter anymore.*/
                }
            }
            if (flag) {
                temp += inputArray[i];
            }
            flag = true;
        }
        System.out.println(temp.replaceAll("[^a-zA-Z]", ""));
    }

    private static void uniqueElementsWithCollections(String input) {
        HashMap<Character,Integer>map = new LinkedHashMap<Character,Integer>();
        char[] inputArray = input.toCharArray();
        for (char letter : inputArray) {
           if(map.containsKey(letter)){
               map.put(letter,map.get(letter)+1);
           }
           else{
               map.put(letter,1);
           }
        }
       map.keySet().stream().forEach(letter->{
           if(map.get(letter)==1){
               System.out.print(letter);
           }
       });
    }
}
