package StringPrograms;

import java.util.LinkedHashMap;

public class FindNumberOfDuplicates {
    public static void main(String[] args) {
        //Find the number of duplicate characters in a string
        String s1="thisisasamplestring";
        LinkedHashMap<Character,Integer>map1 = new LinkedHashMap<>(); //Use LinkedHashMap to maintain order
        char[]carray = s1.toCharArray();
        for(char c:carray){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1); //If the char is already present increase the count of value
            }
            else{
                map1.put(c,1); // else add the character with value as 1
            }
        }
        //Now print characters with value more than 1
        for(Character c:map1.keySet()){
            if(map1.get(c)>1){
                System.out.println(c+" : "+map1.get(c));
            }
        }
    }

}
