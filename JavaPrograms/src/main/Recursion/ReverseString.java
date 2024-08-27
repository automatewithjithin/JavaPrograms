package Recursion;

public class ReverseString {
    //Program to reverse a string using recursion
    public static void main(String []args){
        reverseString("Jithin");
    }

    private static void reverseString(String name) {
        if(name.length()<=1){
            //Print First letter
            System.out.print(name.charAt(name.length()-1)); //index:0
        }
        else{
           // Print letters from backward
            System.out.print(name.charAt(name.length()-1));//index: 5,4,3,2,1
            reverseString(name.substring(0,name.length()-1));
        }
    }



}
