package regex;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        //StringTokenizer st=new StringTokenizer("Hello World");//space-default delimiter
        //StringTokenizer st=new StringTokenizer("www.helloworld.com","."); //this constructor is to give delimiter manually
        StringTokenizer st=new StringTokenizer("11-08-2022","-",true);//if we want to print the delimiter also. delimiter will also be considered as a separate token
        System.out.println("Token Count:"+st.countTokens());//counts the number of words based on space and new line (or) user-given delimiter
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
