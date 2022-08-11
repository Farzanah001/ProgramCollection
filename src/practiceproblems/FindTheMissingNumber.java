package practiceproblems;

import java.util.Scanner;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size=s.nextInt();
        int array[]=new int[size];
        int sum=0,arrSum=0;
        sum=size*(size+1)/2;
        System.out.println("SUM OF "+size+" NATURAL NUMBERS:"+sum);
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
            arrSum+=array[i];
        }
        int missingNumber=arrSum-sum;
        System.out.println("Missing Number:"+missingNumber);

    }
}
