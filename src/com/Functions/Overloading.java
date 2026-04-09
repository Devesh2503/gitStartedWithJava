package com.Functions;

public class Overloading {
    public static void main(String[] args){
        fun(1);
        fun("Kunal");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }
}
