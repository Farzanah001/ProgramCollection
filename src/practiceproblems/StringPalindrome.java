package practiceproblems;

import java.util.Scanner;

public class StringPalindrome {
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        StringPalindrome palindrome=new StringPalindrome();
        palindrome.getInput();
    }

    private void getInput() {
        System.out.println("Enter the String:");
        String originalString= scan.next().toLowerCase();
        checkPalindrome(originalString);
    }

    private void checkPalindrome(String originalString) {
        String reverse="";
        for(int i=originalString.length()-1;i>=0;i--){
            reverse+=originalString.charAt(i);
        }
        //System.out.println(reverse);
        if(originalString.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
