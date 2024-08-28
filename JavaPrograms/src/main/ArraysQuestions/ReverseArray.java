package ArraysQuestions;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ReverseArray {
    public static void main(String []args){
        //Reverse the given array
        int[]numbers = new int[]{1,2,3,4,5,6,7,0};
        int[] reverse = reverseUsingCollections(numbers);
        Arrays.stream(reverse).forEach(s-> System.out.println(s));
        System.out.println("-----------");
        int[] reverse2 = reverseUsingForloop(numbers);
        Arrays.stream(reverse2).forEach(s-> System.out.println(s));
    }

    public static int[] reverseUsingCollections(int []numbers){
        List<Integer>numList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.reverse(numList);
        int []reverse = numList.stream().mapToInt(Integer::intValue).toArray();
        return reverse;
    }

    public static int[]reverseUsingForloop(int []numbers){
        int []revArray = new int[numbers.length];
        int j=0;
        for(int i=numbers.length-1;i>=0;i--){
            revArray[j]=numbers[i];
            j++;
        }
        return revArray;
    }


}
