package datatypeConversions;

import java.util.*;

public class ListAndSetConversion {
    public static void main(String[] args) {
        //Convert integer arrayList to Set

        List<Integer>numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Set<Integer> numSet = new HashSet<>(numbers);
        System.out.println(numSet);
        //Different ways to Iterate over set
        //1. Using foreach loop
        for(Integer num : numSet){
            System.out.println(num);
        }
        // 2. Using streams
        numSet.stream().forEach(num-> System.out.println(num));
        // 3. Using Iterator
        Iterator<Integer>it = numSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
