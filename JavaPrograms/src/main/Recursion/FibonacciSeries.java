package Recursion;


public class FibonacciSeries {
    static int n1=0,n2=1,n3;

    public static void main(String []args){
        int count=8;
        System.out.print(n1 + " "+n2);
        fibonacciUsingRecursion(count-2);
    }

    private static void fibonacciUsingRecursion(int i) {
        if(i>=0){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            fibonacciUsingRecursion(i-1);
        }


    }
}
