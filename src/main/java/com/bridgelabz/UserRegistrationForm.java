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

    //Checking the valid 10digit mobile number//
    @Test
    public static boolean isValidmobilenumber() {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher("91 9985467725");
        assertTrue(matcher.matches());
    }
    // checking VALID PASSWORD
    public void isValidPassword() {
        Pattern pattern = Pattern.compile(".*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&+=]).*$");
        Matcher matcher = pattern.matcher("gauriparh");
    }
    @Test
    //at least 1 uppercase:
    public void isValidPassword_uppercase() {
        Pattern pattern = Pattern.compile(".*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&+=]).*$");
        Matcher matcher = pattern.matcher("GauryiParh");


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

        // //Checking the valid 10digit mobile number//
        System.out.println(isValidmobilenumber());

        //Checking valid password//
        String password = "gauriparh";
        System.out.println(isValidPassword(password));

        //Checking At least one uppercase//
            String password_uppercase = "Gaurya10@";
        System.out.println(isValidPassword(password_uppercase));
    }

    }



}

