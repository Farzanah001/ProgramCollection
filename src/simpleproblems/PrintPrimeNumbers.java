package simpleproblems;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Range:");
        System.out.println("Starting From:");
        int start=scan.nextInt();
        System.out.println("Ending With:");
        int end=scan.nextInt();
        System.out.println("Prime Numbers between "+start+" and "+end+": ");
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int prime) {
        //int count=0;
        if(prime<2){
            return false;
        }
        for(int i=2;i<prime/2;i++){
            if(prime%i==0){
                return false;
            }
        }
        return true;
    }
}
