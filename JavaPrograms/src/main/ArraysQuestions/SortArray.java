package ArraysQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String []args){
        //WAP to sort the given array
        int []numbers = new int[]{3,2,6,4,7,9,8};
        sortFunctionMethod(numbers);
        System.out.println();
        collectionMethod(numbers);
    }

    public static void sortFunctionMethod(int []numbers){
        Arrays.sort(numbers);
        for(int num:numbers){
            System.out.print(num+" ");
        }
    }
    public static void collectionMethod(int []numbers){
        List<Integer> numList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(numList);
        int[]revNumbers = numList.stream().mapToInt(Integer::intValue).toArray();
        for (int num:revNumbers){
            System.out.print(num+" ");
        }
    }
}
