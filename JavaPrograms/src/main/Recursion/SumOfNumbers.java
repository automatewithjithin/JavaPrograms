package Recursion;

public class SumOfNumbers {
    static int []numbers = new int[]{10,20,30,40,50};
    public static void main(String[] args){

        int sum = findSum(numbers.length-1);
        System.out.println("The sum of numbers is "+sum);
    }

    private static int findSum(int n) {
        if(n==0){
            return numbers[n];
        }
        return numbers[n]+findSum(n-1);
    }
}
