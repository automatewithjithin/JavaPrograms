package StringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumberForLetters {
    //Given input prince, print 0 for e, 1 for c, 2 for n, 3 for i, 4 for r and so on
    public static void main(String[] args) {
        String input = "prince";
        int number=input.length()-1;
        LinkedHashMap<Character, Integer>output = new LinkedHashMap<>();
        for(char c : input.toCharArray()){

            output.put(c,number);
            number--;
        }
        output.keySet().stream().forEach(key-> System.out.println(key+" : "+output.get(key)));
    }
}
