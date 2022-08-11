package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethodDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String sentence=scan.nextLine();
        System.out.println("Enter the Word/Pattern to Match:");
        String pattern= scan.next();
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(sentence);
        int count=0;
        while(m.find()){
            count++;
            System.out.println(m.group()+" starts at "+m.start()+" and ends at "+m.end());
        }
        System.out.println("The Pattern is found "+count+" times");
    }
}
