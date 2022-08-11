package twodimensionalarray;

import java.util.Scanner;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Matrix size:");
        int size= scan.nextInt();
        int[][] matrix=new int[size][size];
        System.out.println("Enter "+size*size+" elements for the matrix:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]= scan.nextInt();
            }
        }
        transposeMatrix(size,matrix);
    }

    private static void transposeMatrix(int size, int[][] matrix) {
        System.out.println("Transposed Matrix:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
