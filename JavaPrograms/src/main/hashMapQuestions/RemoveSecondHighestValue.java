package hashMapQuestions;

import java.util.*;

public class RemoveSecondHighestValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);
        map.put("D", 40);
        map.put("E", 50);
        //We need to remove D-40 which is the second highest.
        /*
        * Algorithm
        * Get map values into a list
        * Sort in reverse order and get the value
        * Iterate over the map to check for the second highes value we already found
        * Remove the key value pair
        *
        * */

        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values,Collections.reverseOrder());
        int secondHighest = values.get(1);
        Iterator<String>it = map.keySet().iterator();
        while(it.hasNext()){
            if(map.get(it.next())==secondHighest){
                it.remove();
            }
        }
        System.out.println(map);
    }
}
