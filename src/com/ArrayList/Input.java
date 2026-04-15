package com.ArrayList;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr =new int[5];

//        arr[0]=23122;
//        arr[1]=23123;
//        arr[2]=23132;
//        arr[3]=23231;
//        arr[4]=232;
        Scanner in = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        for(int numbs : arr){
            System.out.println(numbs);
        }

    }
}
