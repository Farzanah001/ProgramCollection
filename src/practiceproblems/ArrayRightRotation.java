package practiceproblems;

import java.util.Scanner;

public class ArrayRightRotation {
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayRightRotation rotation=new ArrayRightRotation();
        rotation.getInput();
    }
    public void getInput(){
        System.out.println("Enter the Array Size:");
        int size= scan.nextInt();
        int[] originalArray=new int[size];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            originalArray[i]=scan.nextInt();
        }
        System.out.println("Enter the Number of times to rotate:");
        int rotateCount=scan.nextInt();
        rotateArray(size,originalArray,rotateCount);
    }

    private void rotateArray(int size, int[] originalArray,int rotateCount) {
        int lastElement;
        for(int i=0;i<rotateCount;i++){
            lastElement=originalArray[originalArray.length-1];
            for(int j=originalArray.length-1;j>0;j--){
                originalArray[j]=originalArray[j-1];
            }
            originalArray[0]=lastElement;
        }
        printArray(originalArray);
    }

    private void printArray(int[] originalArray) {
        System.out.println("Rotated Array:");
        for(int i=0;i<originalArray.length;i++){
            System.out.print(originalArray[i]+" ");
        }
    }
}
