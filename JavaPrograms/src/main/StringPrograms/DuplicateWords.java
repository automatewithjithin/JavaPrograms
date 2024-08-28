package StringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateWords {
    public static void main(String[] args) {
        //FInd duplicate words in a string
        String s1="jithin arunima nibin jithin treasa nibin";
        String []words = s1.split(" ");
        HashSet<String>hset = new HashSet<String>();
        List<String> duplicates = new ArrayList<String>();
        for (String word : words){
            if (!hset.add(word))
                duplicates.add(word);
        }
        System.out.println("Duplicate words");
        duplicates.stream().forEach(word-> System.out.println(word));

    }
}
