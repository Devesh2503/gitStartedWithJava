package com.ArrayList;
import java.util.*;
public class MultiDimentionalArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

       //int[][] arr =new int[3][]; /// adding number of rows while declaration is mandatory

        int[][] arr = {
                {1, 2, 3},// oth index
                {4, 5},// 1st index
                {6, 7, 8, 9}// 2nd index
        };
        // input
        Scanner in = new Scanner(System.in);
       // for(int i=0;i<arr.length;i++){
         //   arr[i][] = in.nextInt();
        //}
        for(int row =0; row < arr.length ; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
