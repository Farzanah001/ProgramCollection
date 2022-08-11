package practiceproblems;

import java.util.Scanner;

public class ArrayLeftRotation {
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayLeftRotation rotation=new ArrayLeftRotation();
        rotation.getInput();
    }

    private void getInput() {
        System.out.println("Enter the Array Size:");
        int size=scan.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] originalArray=new int[size];
        for(int i = 0; i <size; i++){
            originalArray[i]=scan.nextInt();
        }
        System.out.println("Enter the Rotate Count:");
        int rotateCount=scan.nextInt();
        rotateArray(size,originalArray,rotateCount);
    }

    private void rotateArray(int size, int[] originalArray, int rotateCount) {
        int firstElement;
        for(int i=0;i<rotateCount;i++){
            firstElement=originalArray[0];
            for(int j=0;j<originalArray.length-1;j++){
                originalArray[j]=originalArray[j+1];
            }
            originalArray[size-1]=firstElement;
        }
        printArray(originalArray);
    }

    private void printArray(int[] originalArray) {
        System.out.println("Rotated Array:");
        for(int i=0;i<originalArray.length;i++) {
            System.out.print(originalArray[i]+" ");
        }
    }
}
