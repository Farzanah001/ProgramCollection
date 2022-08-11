package practiceproblems;

import java.util.Scanner;

public class FrequencyCounting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size= scan.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= scan.nextInt();
        }
        countFrequency(size,arr);
    }

    private static void countFrequency(int size, int[] arr) {
        int[] frequency=new int[size];
        int visited=-1;
        for(int i=0;i<size;i++){
            int count=1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    frequency[j]=visited;
                }
            }
            if(frequency[i]!=visited){
                frequency[i]=count;
            }
        }
        for(int i=0;i<frequency.length;i++) {
            if (frequency[i] != visited) {
                System.out.println(arr[i] + " " + frequency[i]);
            }
        }
    }
}
