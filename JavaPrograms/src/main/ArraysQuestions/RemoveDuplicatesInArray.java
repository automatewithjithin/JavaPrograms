package ArraysQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        String []input = new String[]{"Jithin","Arunima","Nibin","Arunima","Treasa","Treasa"};
        removeDuplicatesByHashset(input);
        System.out.println(" ");
        removeDuplicatesByStreams(input);
    }

    private static void removeDuplicatesByStreams(String[] input) {
       List<String>uniqueList =  Arrays.stream(input).distinct().collect(Collectors.toList());
        String[]uniqueArray = uniqueList.stream().toArray(String[]::new);
        for(String name : uniqueArray){
            System.out.print(name+" ");
        }
    }

    private static void removeDuplicatesByHashset(String[] input) {
        LinkedHashSet<String> uniqueElements = new LinkedHashSet<>(List.of(input));
        System.out.println(uniqueElements);
        //Convert Hashset back to Array
        String[] uniqueArray = uniqueElements.stream().toArray(String[]::new);
        for(String name:uniqueArray){
            System.out.print(name+" ");
        }
    }
}
