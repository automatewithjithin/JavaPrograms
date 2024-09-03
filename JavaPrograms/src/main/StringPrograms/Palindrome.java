package StringPrograms;

public class Palindrome {
    public static void main(String []args){
        checkPalindromeUsingStringBuilder("nibin");
        checkPalindrome("nibin");
    }

    private static void checkPalindrome(String word) {
        int left=0,right=word.length()-1;
        boolean flag=true;
        while(left<=right){
            if(word.charAt(left)!=word.charAt(right)){
                System.out.println("Not Palindrome");
                flag=false;
                break;
            }
            left++;
            right--;
        }
        if (flag)
            System.out.println("Palindrome");

    }

    private static void checkPalindromeUsingStringBuilder(String word) {
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        sb.reverse();
        String revString = sb.toString();
        if(word.equals(revString))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
