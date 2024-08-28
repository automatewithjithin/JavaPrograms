package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //Remove duplicate characters in string
        String s1 = "thisisasamplestring";
        char[] ch = s1.toCharArray();
        LinkedHashSet<Character> hs = new LinkedHashSet<Character>(); //Use LinkedHashset to maintain order.
        for (char c : ch) {
            hs.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:hs){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
