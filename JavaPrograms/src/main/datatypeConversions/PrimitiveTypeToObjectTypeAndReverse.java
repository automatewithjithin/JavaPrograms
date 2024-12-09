package datatypeConversions;

import java.util.Arrays;
import java.util.List;

public class PrimitiveTypeToObjectTypeAndReverse {
    public static void main(String[] args) {

        // 1. Convert integer array to list and reverse
        int []numbers = new int[]{1,2,3,4,5};
        convertIntegerArrayToList(numbers);
        //2. Convert string array to list and reverse
        String[]input = new String[]{"Jithin","Nibin","Alex","Mathew"};
        convertStringArrayToListAndReverse(input);
    }

    private static void convertStringArrayToListAndReverse(String[] input) {
        List<String>inputList = List.of(input);
        System.out.println(inputList);
        //back to array
        String []backToArray = inputList.stream().toArray(String[]::new);
        for(String name : backToArray){
            System.out.println(name);
        }
    }

    public static void convertIntegerArrayToList(int[]numbers){

        List<Integer> numList = Arrays.stream(numbers).boxed().toList();
        //Converting primitive type to object type is called boxing.
        numList.stream().forEach(x-> System.out.println(x));
        //2. Convert integer list to array
        int []finalNumbers = numList.stream().mapToInt(Integer::intValue).toArray();
        for(int num: finalNumbers){
            System.out.print(num+" ");
        }
    }
}
