package ArraysQuestions;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinMaxValue {
    public static void main(String []args){
        //WAP to find minimum and maximum value in an array
        findMinMax(new int[]{1,2,3,4,53,7,8});
        findMaxMinUsingStreams(new int[]{1,2,3,4,53,7,8});
    }

    public static void findMinMax(int[] numbers){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]>max)
                max=numbers[i];
            if (numbers[i]<min)
                min=numbers[i];
        }

        System.out.println("The minimum value is "+min+" and maximum value is "+max);

    }
    public static void findMaxMinUsingStreams(int []numbers){
        OptionalInt minimum= Arrays.stream(numbers).min();
        OptionalInt maximum=Arrays.stream(numbers).max();
        System.out.println("The minimum value is "+minimum.getAsInt()+" and maximum value is "+maximum.getAsInt());
    }


}
