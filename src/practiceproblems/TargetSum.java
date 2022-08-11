package practiceproblems;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size= scan.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the Target:");
        int target= scan.nextInt();
        targetSum(size,arr,target);
    }

    private static void targetSum(int size, int[] arr, int target) {
        //ArrayList<Integer> tempArray=new ArrayList<>();
        int[] tempArray=new int[2];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int temp=arr[i]+arr[j];
                if(temp==target){
                    tempArray[0]=i;
                    tempArray[1]=j;
                    break;
                }
            }
        }
        //System.out.print("[");
        for(int i=0;i<2;i++) {
            System.out.print(tempArray[i]+" ");
        }
        //System.out.print("]");
    }
}
