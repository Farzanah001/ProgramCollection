package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetaCharactersDemo {
    public static void main(String[] args) {
        String strSpace="aaabbbaabbabab";
        Pattern p=Pattern.compile("a?");
        Matcher ma=p.matcher(strSpace);
        while (ma.find()){
            System.out.println(ma.group()+" starts at"+ma.start());
        }
    }
}
