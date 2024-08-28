package StringPrograms;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String s1 = "Jithin";
        String s2 = "Jose";
        //WAP to swap these two Strings
        System.out.println("Before Swap");
        System.out.println(s1 + " "+s2);
        s1=s1.concat(s2); //JithinJose
        s2=s1.substring(0,s1.length()-s2.length()); //Jithin
        s1=s1.substring(s2.length());//Jose
        System.out.println("After Swap");
        System.out.println(s1 + " "+s2);

    }
}
