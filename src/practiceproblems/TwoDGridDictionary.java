package practiceproblems;

import java.util.Scanner;

public class TwoDGridDictionary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size= scan.nextInt();
        char[][] grid=new char[size][size];
        System.out.println("Enter "+size*size+" Elements for the 2D Array:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                grid[i][j]=scan.next().charAt(0);
            }
            String str="ilike";
            str.substring(0);
        }
        String[] word=new String[5];
        word[0]="van";
        word[1]="zoho";
        word[2]="love";
        word[3]="are";
        word[4]="is";
        //word[5]="zoo";

        for(int i=0;i< word.length;i++){
            String tempAppend="";
            boolean flag=true;
            int charIndex=0;
            for(int r=0;r< size;r++){
                for(int c=0;c<size;c++){
                    if(word[i].equals(tempAppend)){
                        flag=false;
                        break;
                    }
                    else {
                        if(grid[r][c]==word[i].charAt(charIndex)){
                            tempAppend+=word[i].charAt(charIndex++);
                        }
                        else{
                            tempAppend="";
                            charIndex=0;
                        }
                    }

                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                int var=0;
                while(var!= size){
                    charIndex=0;
                    for(int x=0;x<size;x++){
                        for(int y=0;y<size;y++){
                            if(word[i].equals(tempAppend)) {
                                flag = false;
                                break;
                            }
                            else {
                                if(grid[y][x]==word[i].charAt(charIndex)){
                                    tempAppend+=word[i].charAt(charIndex++);
                                }
                                else {
                                    tempAppend="";
                                    charIndex=0;
                                }
                            }
                        }
                    }
                    var++;
                }
            }
            System.out.println(tempAppend);
        }

        printArray(size,grid);
    }

    private static void printArray(int size, char[][] grid) {

        System.out.println("Array:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
