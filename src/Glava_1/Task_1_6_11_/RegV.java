package Glava_1.Task_1_6_11_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegV {
    public static void main(String[] args) {
        String email="Akobir@yandex.ru";
        System.out.print(isGmailOrOutlook(email));


    }
    public static boolean isGmailOrOutlook(String email) {
        String emailPattern ="A.+?u";
        Pattern p = Pattern.compile(emailPattern);
        Matcher m = p.matcher(email);
        return m.matches();
    }

}
