package Recursion;

public class Permutations {


    // Method to print permutations of a given string
    private static void printPermutations(String str, String ans) {
        // If the input string becomes empty, print the resulting string
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Get the ith character from str
            char ch = str.charAt(i);
           
            // Get the rest of the string after removing the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recur with the remaining string and add the ith character to the result
            printPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "");
    }
}


