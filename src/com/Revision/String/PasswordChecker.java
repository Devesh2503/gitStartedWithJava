package com.Revision.String;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password:");

        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        if(password.length() < 8) {

            System.out.println("Password too short");
            return;

        }

        for(int i=0; i<password.length(); i++) {

            char ch = password.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {

                hasUpper = true;

            }
            else if(ch >= 'a' && ch <= 'z') {

                hasLower = true;

            }
            else if(ch >= '0' && ch <= '9') {

                hasDigit = true;

            }

        }

        if(hasUpper && hasLower && hasDigit) {

            System.out.println("Strong Password");

        }
        else {

            System.out.println("Weak Password");

        }

    }

}