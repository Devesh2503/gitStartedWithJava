package com.Kunal;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a +" is the largest number");
            }else{
                System.out.println(c +" is the largest number");
            }
        }else{
            if(b>c){
                System.out.println(b +" is the largest number");
            }else{
                System.out.println(c +" is the largest number");
            }
        }


        int max = Math.max(c,Math.max(a,b));
        System.out.println(max +" is the largest number");
    }
}
