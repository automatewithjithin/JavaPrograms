package StringPrograms;

public class CountOfCapitalAndSmallLetters {
    //Count the number of Capital and Small letters in a String. Also count whiteSpace.
    public static void main(String[] args) {
        String s1 = "This is a sample String";
        int upper=0,lower=0,space=0;
        char[]charArray=s1.toCharArray();
        for(char c:charArray){
            if (Character.isUpperCase(c))
                upper++;
            if(Character.isLowerCase(c))
                lower++;
            if(Character.isWhitespace(c))
                space++;

        }
        System.out.println("Capital Letters: "+upper);
        System.out.println("Small Letters: "+lower);
        System.out.println("Space: "+space);
    }

}
