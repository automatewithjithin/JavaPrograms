package StringPrograms;

public class FormatString {
    public static void main(String[] args) {
        //given a string "a2b3c4d5" separate alphabet and numbers

        String s1="a2b3c4d5";
        String word=s1.replaceAll("[a-z]","");
        String numbers=s1.replaceAll("[0-9]","");
        System.out.println(word);
        System.out.println(numbers);
    }
}
