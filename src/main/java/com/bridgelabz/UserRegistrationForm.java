package com.bridgelabz;
import java.util.regex.*;

public class UserRegistrationForm {

    public static boolean isValidlastUsername(String name)
    {
        String regex="^[Cap]\\w{5,29}[A-Za-z]$";

        Pattern p=Pattern.compile(regex);

        if (name ==null){
            return false;
        }

        //Pattern class contains matcher() method
        //to find matching between given username
        //and regular expression
        Matcher m =p.matcher(name);

        //Return if the username
        return m.matches();
    }
    public static void main(String[] args)
    {
        String str1="INDIA";
        System.out.println(isValidFirstUsername(str1));

        String str2="Cap4344";
        System.out.println(isValidFirstUsername(str2));

        String str3="Cap2314";
        System.out.println(isValidFirstUsername(str3));
    }
    public static void main(String[] args) {
        //Checking for lastusername

        //Test Case:1
        String str1 = "Maharashtra";
        System.out.println(isValidlastUsername(str1));

        //Test case 2
        String str2 = "Cap434abc";
        System.out.println(isValidlastUsername(str2));

        //Test Case:3
        String str3 = "Cap231xyz";
        System.out.println(isValidlastUsername(str3));
    }



}

