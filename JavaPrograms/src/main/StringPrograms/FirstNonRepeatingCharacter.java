package StringPrograms;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        //Program to fing first non repeating character in a string
        String s1="jithinandarunimajithin"; //first non repeating character is d
        char []c1=s1.toCharArray();
        LinkedHashMap<Character,Integer>hmap=new LinkedHashMap<>();
        for(char c : c1){
            if(hmap.containsKey(c)){
                hmap.put(c,hmap.get(c)+1);
            }
            else{
                hmap.put(c,1);
            }
        }
        //Find out non repeating character
        for(char c : hmap.keySet()){
            if (hmap.get(c)==1){
                System.out.println("The first non repeating character is "+c);
                break;
            }
        }
    }
}
