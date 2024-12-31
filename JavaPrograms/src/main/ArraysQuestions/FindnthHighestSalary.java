package ArraysQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class FindnthHighestSalary {
    public static void main(String[] args) {
        int[]salary = new int[] {56000,45000,45000,12000,56000,10000,20000};
        findNthHighestSalary(salary, 2);
    }

    private static void findNthHighestSalary(int[] salary, int n) {
       Optional<Integer> ntthHighestSalary =  Arrays.stream(salary).boxed().distinct()
               .sorted(Comparator.reverseOrder())
               .skip(n-1).findFirst();
        System.out.println(ntthHighestSalary.get());
    }
}
