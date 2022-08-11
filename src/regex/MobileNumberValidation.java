package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
        String mobile= scan.next();
        Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m=p.matcher(mobile);
        if(m.find()){
            System.out.println(mobile+" is Valid");
        }
        else{
            System.out.println(mobile+" is not Valid");
        }
    }
}
