package practiceproblems;

import java.util.Scanner;

public class SwapAdjacentPairs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size=scan.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            array[i]= scan.nextInt();
        }
        swapPairs(size,array);
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void swapPairs(int size, int[] array) {
        for(int i=0;i<size;i+=2){
            if(i+1 < array.length) {
                if (array[i] < array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    //break;
                }
            }
        }
    }
}
