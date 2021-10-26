package com.bridgelabzday21_user_reg;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstNameCheck(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        if (check)
            System.out.println("Perfect! First #Name");
        else
            System.out.println("Please Enter a Valid First name with Only \"One Starting Capital\" latter");
        return check;
    }


    public boolean lastNameCheck(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        if (check)
            System.out.println("Perfect! Last #Name");
        else
            System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" latter");
        return check;
    }

    public boolean email(String str) {
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", str);
        if (check)
            System.out.println("Perfect! #Email!");
        else
            System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.com\" latter");

        return check;
    }


    public boolean mobileNum(String str) {
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", str);
        if (check)
            System.out.println("Perfect! Mobile #Num");
        else
            System.out.println("Please Enter a Valid Mobile Num ex:- 90 8073227941");
        return check;
    }

    // rule1  minimum 8 characters
    public boolean passWordRule1(String str) {
        boolean check = Pattern.matches("[a-zA-Z]{8,}", str);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
        return check;
    }

    // rule2  minimum 8 characters with 1 upper case
    public boolean passWordRule2(String str) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", str);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with 1 upper case");
        return check;
    }

    // rule2  minimum 8 characters with, 1 upper case and 1 Numeric
    public boolean passWordRule3(String str) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}", str);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case and 1 Numeric ");
        return check;
    }


    // rule1  minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char
    public boolean passWordRule4(String str) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", str);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char ");
        return check;
    }

    // this is code for which satisfies for all emails given to check
    public boolean emailUniversal(String eMail) {
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
        if (check)
            System.out.println("Perfect! #Email!");
        else
            System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.com\" latter");
        return check;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration user = new UserRegistration();

        System.out.println("Welcome to User Registration Program");
    }
}