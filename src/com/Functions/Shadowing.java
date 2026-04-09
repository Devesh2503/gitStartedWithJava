package com.Functions;

public class Shadowing {
    static int x=90;
    public static void main(String[] args){
        System.out.println(x);//90
        int x;
        x=40;/// scope will begin when value is initialised
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
// static is object independent
// we cannot use object dependent things in object independent method (Static)
// variable with higher level scope is hidden