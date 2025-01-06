package ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumberLeftEvenRight {
    public static void main(String[] args) {
        int[]numbers = new int[] {1,2,3,4,5,6,7,8,9};
        //shift even numbers to right and odd numbers to left
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        Arrays.stream(numbers).forEach(num->{
            if(num%2!=0) {
                odd.add(num);
            }
            else
                even.add(num);
        });
        odd.addAll(even);
        int []result = odd.stream().mapToInt(Integer::intValue).toArray();
       for(int number:result){
           System.out.print(number+" ");
       }
    }
}
