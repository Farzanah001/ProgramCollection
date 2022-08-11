package simpleproblems;

import java.util.Locale;
import java.util.Scanner;

public class StringHasVowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String:");
        String input= scan.next();
        if(checkVowel(input)){
            System.out.println("The Given String Have Vowels");
        }
        else {
            System.out.println("The Given Strings doesn't have Vowels");
        }
    }

    private static boolean checkVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
