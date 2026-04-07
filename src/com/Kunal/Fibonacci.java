package com.Kunal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        // a=0,b=1,n=7;
        // 0,1,1,2,3,5,8,13 here nth term (7th term ) is 13 so find nth term
        Scanner in = new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        int n=in.nextInt();
        if(n==1){
            System.out.println(a);
        }else if(n==2){
            System.out.println(b);
        }else{
            while(n>1){
                c=a+b;
                a=b;
                b=c;
                n--;
            }
            System.out.println(c);
        }

    }
}
