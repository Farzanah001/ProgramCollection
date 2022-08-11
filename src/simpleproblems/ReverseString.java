package simpleproblems;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String:");
        String input=scan.next();
        if(input==null){
            throw new IllegalArgumentException("Input is Null!");
        }
        else {
            System.out.println("Reversed String:" + reverse(input));
        }
    }

    private static String reverse(String input) {
        String result="";
        for(int i=input.length()-1;i>=0;i--){
            result=result+input.charAt(i);
        }
        return result;
    }
}
