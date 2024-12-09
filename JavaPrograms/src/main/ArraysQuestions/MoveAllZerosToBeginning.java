package ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToBeginning {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,0,4,5,6,0,7,8,9,0};
        List<Integer>numList = new ArrayList<>();
        Arrays.stream(numbers).forEach(number->{
            if(number==0){
                numList.addFirst(number);
            }
            else {
                numList.add(number);
            }
        });
        numList.stream().forEach(item-> System.out.print(item+" "));
    }
}
