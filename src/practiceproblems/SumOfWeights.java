package practiceproblems;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfWeights {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size=scan.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        findWeights(size,array);
    }

    private static void findWeights(int size, int[] array) {
        Arrays.sort(array);
        for(int i=0;i<size;i++){
            int weight=0;
            if(Math.ceil((double) Math.sqrt(array[i]))==Math.floor((double) Math.sqrt(array[i]))){
                weight+=array[i]+5;

            }
            if(array[i]%4==0 && array[i]%6==0){
                weight+=array[i]+4;
            }
            if(array[i]%2==0){
                weight+=array[i]+2;
            }
            System.out.println("<"+array[i]+","+weight+">");
        }
    }
}
