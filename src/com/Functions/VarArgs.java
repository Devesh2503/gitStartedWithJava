package com.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;
// Variable length argument
public class VarArgs {

    public static void main(String[] args){
        fun(2,3,4,5,6);
        multiple(2,3,"kunal","pooja","Shivani");
    }
     static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b, String ...v){

    }
}
