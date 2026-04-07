package com.Kunal;

import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char ch = sc.next().trim().charAt(0);

//        System.out.println(sc.next());
//        System.out.println(sc.next().trim());
//        System.out.println(sc.next().trim().charAt(0));

        if(ch >= 'a' && ch<='z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper case");
        }
    }
}
