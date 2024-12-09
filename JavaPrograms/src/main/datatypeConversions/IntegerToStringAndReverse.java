package datatypeConversions;

public class IntegerToStringAndReverse {
    public static void main(String[] args) {
        int number = 10;
        //Convert int to string
        String numString = Integer.toString(number);
        System.out.println(numString);
        //Convert String to integer
        int newNUmber = Integer.parseInt(numString);
        System.out.println(newNUmber);
    }
}
