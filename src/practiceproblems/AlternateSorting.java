package practiceproblems;

import java.util.Scanner;

public class AlternateSorting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int arrSize= scan.nextInt();
        System.out.println("Enter Array Elements:");
        int[] arr=new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i]=scan.nextInt();
        }
        sortEvenIndex(arrSize,arr);
    }

    private static void sortEvenIndex(int arrSize, int[] arr) {
        for(int i=0;i<arrSize;i++){
            for(int j=i+1;j<arrSize;j++){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
        }
       int leftIndex=0,rightIndex=arrSize-1;
       while(leftIndex<rightIndex){
           System.out.print(arr[leftIndex++]+" ");
           System.out.print(arr[rightIndex--]+" ");

       }
       if(arrSize%2!=0){
           System.out.print(arr[leftIndex]+" ");
       }
    }

}
