package simpleproblems;

import java.util.Scanner;

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Ending Range:");
        int range = scan.nextInt();
        System.out.println(printFibonacci(range) + " ");
    }

    private static int printFibonacci(int range) {
        if (range <= 1)
            return range;
        return printFibonacci(range - 1) + printFibonacci(range - 2);
    }
}
