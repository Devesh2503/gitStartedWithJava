package com.Revision.Array;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args){

    }
    static void creatingArray(){
        int[] numbers = new int[5];

        // assigning values to an array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // printing Array in loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    static void inputArray(){
        // taking array as an input

        Scanner sc =new Scanner(System.in);

        int[] numbers =new int[5];

        for(int i=0; i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }

        for(int num : numbers){
            System.out.println(num);
        }

    }


}
