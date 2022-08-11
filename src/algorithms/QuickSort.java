package algorithms;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size= scan.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] quickArray=new int[size];
        for(int i=0;i<size;i++){
            quickArray[i]=scan.nextInt();
        }
        quickSort(quickArray,0,size-1);
    }

    private static void quickSort(int[] quickArray, int low, int high) {

    }
}
