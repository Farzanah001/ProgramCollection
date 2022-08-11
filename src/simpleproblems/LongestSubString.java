package simpleproblems;

import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Strings to be Compared:");
        int size= scan.nextInt();
        String[] words=new String[size];
        System.out.println("Enter the Strings:");
        for(int i=0;i<size;i++){
            words[i]=scan.next();
        }
        findCommonPrefix(size,words);
    }

    private static void findCommonPrefix(int size, String[] words) {
        String firstString=words[0];
        String result="";
        for(int i=0;i<firstString.length();i++){
            for(int j=i+1;j<firstString.length();j++){
                String temp=firstString.substring(i,j);
                int k=1;
                for(;k<size;k++)
                    if (!words[k].contains(temp))
                        break;

                if(k==size && result.length()<temp.length()){
                    result=temp;
                }
            }
        }
        if(result.length()>=3){
            System.out.println(result);
        }
        else {
            System.out.println("()");
        }
    }
}
