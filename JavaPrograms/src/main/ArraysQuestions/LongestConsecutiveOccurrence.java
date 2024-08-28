package ArraysQuestions;

public class LongestConsecutiveOccurrence {
    public static void main(String[] args) {
        //Program to find the number of consecutive occurrence in an array
        //[4,3,25,6,7,8,9,2,3,10] - There are 4 numbers are consecutive. - 6,7 ; 7,8 ; 8,9 ; 2,3

        int []numbers=new int[]{4,3,25,6,7,8,9,2,3,10};
        int count=0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]+1==numbers[i+1])
                count++;
        }
        System.out.println("The number of consecutive occurrence is "+count);
    }
}
