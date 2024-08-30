package Recursion;

import java.util.Arrays;

public class ReverseArray {
    static int []numbers = new int []{1,2,3,4,5};
    static  int []revNumbers=new int[numbers.length];
    static int i=0;
    public static void main(String []args){

        revArrayByRecursion(numbers.length);
        Arrays.stream(revNumbers).forEach(x-> System.out.print(x+" "));
    }

    private static void revArrayByRecursion(int length) {
        if (length <= 0)
            revNumbers[revNumbers.length - 1] = numbers[0];
        else {
            revNumbers[i] = numbers[length - 1];
            i++;
            revArrayByRecursion(length - 1);
        }
    }
}
