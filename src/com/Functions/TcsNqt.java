package com.Functions;
import java.util.*;
public class TcsNqt {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String input =in.nextLine();

        input = input.replace("[","");
        input =input.replace("]","");

        String[] parts = input.split(",");

        int[] array = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            array[i]=(int)parts[i].trim().charAt(0)-(int)'0';

            //array[i]=Integer.parseInt(parts[i].trim());

        }

        for(int num : array){
            System.out.print(num +" ");
        }




    }

}
