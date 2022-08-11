package practiceproblems;

import java.util.Scanner;

public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int rows= scan.nextInt();
        System.out.println("Enter the number of Columns:");
        int columns= scan.nextInt();
        int[][] booleanMatrix=new int[rows][columns];
        System.out.println("Enter "+rows*columns+" Elements for the 2D Array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                booleanMatrix[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix before Modification:");
        printMatrix(booleanMatrix,rows,columns);
        modifyMatrix(booleanMatrix,rows,columns);
        System.out.println("Matrix after Modification:");
        printMatrix(booleanMatrix,rows,columns);
    }

    private static void modifyMatrix(int[][] booleanMatrix, int rows, int columns) {
        int[] tempRow=new int[rows];
        int[] tempColumn=new int[columns];
        for(int i=0;i<tempRow.length;i++){
            tempRow[i]=0;
        }
        for(int j=0;j<tempColumn.length;j++){
            tempColumn[j]=0;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(booleanMatrix[i][j]==1){
                    tempRow[i]=1;
                    tempColumn[j]=1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(tempRow[i]==1||tempColumn[j]==1){
                    booleanMatrix[i][j]=1;
                }
            }
        }
    }

    private static void printMatrix(int[][] booleanMatrix, int rows, int columns) {
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(booleanMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
