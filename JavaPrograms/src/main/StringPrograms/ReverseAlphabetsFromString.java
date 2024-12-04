package StringPrograms;

public class ReverseAlphabetsFromString {
    public static void main(String[] args) {
        String input = "23sample45test";
        //output: 23elpmas45tset
        input=input+"1";
        System.out.println(input);
        StringBuilder temp = new StringBuilder();
        StringBuilder output = new StringBuilder();
        char []inputArray = input.toCharArray();

        for (char c : inputArray) {
            if (Character.isLetter(c)) {
                temp.append(c);
                System.out.println(temp);
            } else {
                output.append(temp.reverse());
                temp.setLength(0);
                output.append(c);
            }
        }
        System.out.println(output.deleteCharAt(output.length()-1));
    }
}
