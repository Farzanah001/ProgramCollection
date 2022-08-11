package practiceproblems;

import java.util.Scanner;

public class SumAdjacentPairs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size=scan.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            array[i]= scan.nextInt();
        }
        sumPairs(size,array);
//        for(int i=0;i<size;i++){
//            System.out.print(array[i]+" ");
//        }
    }

    private static void sumPairs(int size, int[] array) {
        int sum=0;
        for(int i=0;i<size;i+=2){
            if(i+1<array.length) {
                sum = array[i] + array[i + 1];
                System.out.print(sum + " ");
            }
        }
    }
}
