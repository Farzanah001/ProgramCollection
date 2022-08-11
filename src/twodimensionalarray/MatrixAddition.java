package twodimensionalarray;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Matrix Size:");
        int size= scan.nextInt();
        int[][] array1=new int[size][size];
        System.out.println("Enter "+size*size+" for Array 1:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                array1[i][j]= scan.nextInt();
            }
        }
        int[][] array2=new int[size][size];
        System.out.println("Enter "+size*size+" for Array 2:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                array2[i][j]= scan.nextInt();
            }
        }
        addMatrix(size,array1,array2);
    }

    private static void addMatrix(int size, int[][] array1, int[][] array2) {
        int[][] resultantMatrix=new int[size][size];
        System.out.println("Resultant Matrix:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                resultantMatrix[i][j]=array1[i][j]+array2[i][j];
                System.out.print(resultantMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
