package ArraysQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String []args){
        //WAP to sort the given array
        int []numbers = new int[]{3,2,6,4,7,9,8};
        sortFunctionMethod(numbers);
        System.out.println();
        collectionMethod(numbers);
        System.out.println();
        sortUsingStreams(numbers);
        System.out.println();
        sortInReverseOrder(numbers);
        sortInReverseOrderUsingComparator(numbers);
    }

    private static void sortInReverseOrderUsingComparator(int[] numbers) {
        List<Integer>numList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(numList,Comparator.reverseOrder());
        System.out.println(numList);
    }

    private static void sortUsingStreams(int[] numbers) {
        int[]sortedNumbers = Arrays.stream(numbers).sorted().toArray();

        for(int number : sortedNumbers){
            System.out.print(number+" ");
        }
    }

    private static void sortInReverseOrder(int[] numbers) {
        List<Integer>numList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(numList,Collections.reverseOrder());

        System.out.println(numList);
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
