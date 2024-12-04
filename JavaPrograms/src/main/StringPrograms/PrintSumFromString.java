package StringPrograms;

public class PrintSumFromString {
    public static void main(String[] args) {
        String input = "prince123";
        //output: 6
        int sum=0;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
               sum+=Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println(sum);
    }
}
