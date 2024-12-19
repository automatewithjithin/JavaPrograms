package StringPrograms;

public class DuplicateCharactersWithoutHashmap {
    public static void main(String[] args) {
        //Find the duplicate characters in a string without using Hashmap

        String input = "Programmingtheworld";
        char[]inputArray = input.toCharArray();
        int[]counts = new int[256];
        for(char c : inputArray){
            counts[c]++;
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]>1){
                System.out.println((char)i +" : "+counts[i]);
            }
        }
    }
}
