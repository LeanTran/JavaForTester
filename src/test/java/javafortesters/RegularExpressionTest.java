package javafortesters;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

// Try to do with pattern- not exercise
    private static Pattern pswNamePtrn =
            Pattern.compile("(.*[A-Z].*)(.*[0-9].*)");

    public static boolean validatePassword(String password){

//        String regex =""
        Matcher mtch = pswNamePtrn.matcher(password);
        if(mtch.matches()){
            return true;
        }
        return false;
    }



    @Test
    public void passwordValidate() throws IllegalPassword {

        Account acc = new Account();
        acc.setPassword(".*[a01234a56789]+.*");

    }



}
