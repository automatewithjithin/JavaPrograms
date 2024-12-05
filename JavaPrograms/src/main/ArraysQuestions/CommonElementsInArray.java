package ArraysQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInArray {
    public static void main(String[] args) {
        //WAP to find common elements in two arrays
        String []input1 = new String[]{"ABC","DEF","GHI"};
        String []input2 = new String[]{"DEF","GHI","XYZ"};
        /*utput should be DEF, GHI
        Method 1. Converting to arraylist using function retainall
        Method 2. Using Streams
        Method 3. Using Loops
        */
        findCommonElementsUsingArrayListFunction(input1,input2);
        findCommonElementsUsingArrayListStreams(input1,input2);
        findCommonElementsUsingArrayListUsingLoops(input1,input2);
    }

    private static void findCommonElementsUsingArrayListUsingLoops(String[] input1, String[] input2) {
        ArrayList<String>list1 = new ArrayList<String>(List.of(input1));
        ArrayList<String>list2 = new ArrayList<String>(List.of(input2));
        ArrayList<String>list3 = new ArrayList<String>();
        for(String item : input1){
            if(list2.contains(item)){
                list3.add(item);
            }
        }
        System.out.println(list3);
    }

    private static void findCommonElementsUsingArrayListStreams(String[] input1, String[] input2) {
        ArrayList<String>list1 = new ArrayList<String>(List.of(input1));
        ArrayList<String>list2 = new ArrayList<String>(List.of(input2));
        List<String>commonElements = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(commonElements);
    }

    private static void findCommonElementsUsingArrayListFunction(String[] input1, String[] input2) {
        /*
        * Algorithm
        * Create 3 arraylists
        * Copy array 1 and 2 to arraylist 1 and 2 respectively
        * Copy array 1 to array 3 to preserve data in array 1
        * use retain function
        * */
        ArrayList<String>list1 = new ArrayList<String>(List.of(input1));
        ArrayList<String>list2 = new ArrayList<String>(List.of(input2));
        ArrayList<String>list3 = new ArrayList<String>(list1);
        list3.retainAll(list2);
        System.out.println(list3);
    }
}
