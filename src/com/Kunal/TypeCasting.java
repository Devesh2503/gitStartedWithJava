package com.Kunal;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        float num= input.nextFloat(); // here if it gives input as an integer then it will by default get converted to int
        // 1.here it should be like type should be compatible
        // 2. destination type should be greater than source type

        int numb= (int)(67.56f);// This is known as type casting

        // automatic type promotion in expression

        int a= 257;
        byte b= (byte)a; // 257 % 256=1

        byte c=40;
        byte d=50;
        byte e = 100;
        int f= c*d/e;
        System.out.println(f);

    }
}
