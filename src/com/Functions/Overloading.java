package com.Functions;

public class Overloading {
    public static void main(String[] args){
        fun(1);
        fun("Kunal");
        System.out.println(sun(1,2));
        System.out.println(sun(1,2,4));
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }

    static int sun(int a,int b){
        return a+b;
    }

    static int sun(int a,int b,int c){
        return a+b+c;
    }
}
