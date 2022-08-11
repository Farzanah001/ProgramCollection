package practiceproblems;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Row Size:");
        int row= scan.nextInt();
        System.out.println("Enter the Column Size:");
        int column= scan.nextInt();
        int[][] spiral=new int[row][column];
        System.out.println("Enter "+row*column+" Elements for the Array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                spiral[i][j]= scan.nextInt();
            }
        }
        spiralMatrix(spiral,row,column);
    }

    private static void spiralMatrix(int[][] spiral,int row,int column) {
        int rowStart=0,colStart=0,rowEnd=row,colEnd=column;
        while (rowStart<rowEnd && colStart<colEnd){
            //left to right
            for(int i=colStart;i<colEnd;i++){
                System.out.print(spiral[colStart][i]+" ");
            }
            rowStart+=1;//move to next row
            //top to bottom
            for(int i=rowStart;i<rowEnd;i++){
                System.out.print(spiral[i][colEnd-1]+" ");
            }
            colEnd-=1;//move to left column
            //right to left
            for(int i=colEnd-1;i>=colStart;i--){
                System.out.print(spiral[rowEnd-1][i]+" ");
            }
            rowEnd-=1;//move to upper row
            //bottom to top
            for(int i=rowEnd-1;i>=rowStart;i--){
                System.out.print(spiral[i][colStart]+" ");
            }
            colStart+=1;//move to right column
        }
    }
}
