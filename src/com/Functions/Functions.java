package com.Functions;
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        Sum();
        System.out.println(Sum3(10,20));

    }

    public static void Sum(){
        System.out.print("Enter no 1 :");
        int num1 ,num2,sum;
        Scanner in =new Scanner(System.in);
        num1 = in.nextInt();
        System.out.print("Enter no 2 :");
        num2 = in.nextInt();
        sum= num1+num2;
        System.out.println(sum);
    }

    public static int Sum2(){
        System.out.print("Enter no 1 :");
        int num1 ,num2,sum;
        Scanner in =new Scanner(System.in);
        num1 = in.nextInt();
        System.out.print("Enter no 2 :");
        num2 = in.nextInt();
        sum= num1+num2;

        return sum;
    }

    public static int Sum3(int a, int b){
        int ans = a+b;

        return ans;
    }
    /*
    access modifier (we'll look in OOP) return type name () {
    body

    return statement;
    }
     */
}

// Q: take inputs from 2 numbers and print the sum.