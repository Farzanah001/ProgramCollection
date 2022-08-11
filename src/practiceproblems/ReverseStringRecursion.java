package practiceproblems;

import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ReverseStringRecursion rp=new ReverseStringRecursion();
        System.out.println("Enter the string");
        String s=sc.nextLine();
        String p="";
        p=rp.recursive(s,s.length(),p);
        System.out.println(p);


    }

    private String recursive(String s,int length,String p) {

        if(length-1>=0) {
            p+=s.charAt(length-1);
            length--;
            p=recursive(s,length,p);
        }
        return p;


    }

}
