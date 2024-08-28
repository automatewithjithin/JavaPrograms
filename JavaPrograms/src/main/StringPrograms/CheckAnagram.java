package StringPrograms;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        /*
        * Check whether the given two words are anagram or not
        * Anagram is word made of another word
        * for example: reed/deer, bare/bear
        * This can be done by sorting and checking they are equal or not
        * */
        String s1="reed";
        String s2="deer";
        char[]a1=s1.toCharArray();
        char[]a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean flag = Arrays.equals(a1,a2);
        if(flag)
            System.out.println("Anagram");
        else
            System.out.println("Not an anagram");
    }
}
