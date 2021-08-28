package com.bridgelabz;
import java.util.regex.*;

public class UserRegistrationForm {

    public static boolean isValidFirstUsername(String name)
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

    //Checking email Id:

    public static boolean isValidEmail(String name) {

        Pattern p = Pattern.compile("\\B[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher m = p.matcher("thegauriparhad@gmail.com");

    }



    public static void main(String[] args) {
        String str1 = "INDIA";
        System.out.println(isValidFirstUsername(str1));

        String str2 = "Cap4344";
        System.out.println(isValidFirstUsername(str2));

        String str3 = "Cap2314";
        System.out.println(isValidFirstUsername(str3));


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

        //checking mail-id:
        String email = "thegauriparhad@gmail.com";
        System.out.println(isValidEmail(email));
    }



}

