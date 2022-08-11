package practiceproblems;

import java.util.Scanner;

public class ReplaceWithGreatest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int arrSize= scan.nextInt();
        System.out.println("Enter Array Elements:");
        int[] arr=new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i]=scan.nextInt();
        }
        replaceGreatest(arr);
        printArray(arr,arrSize);
    }

    private static void replaceGreatest(int[] arr) {
        int size=arr.length;
        int max=arr[size-1];
        arr[size-1]=-1;
        for(int i=size-2;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            if(max<temp){
                max=temp;
            }
        }
        }

    private static void printArray(int[] arr, int arrSize) {
        for(int i=0;i<arrSize;i++){
            System.out.print(arr[i]+" ");
        }
    }
}