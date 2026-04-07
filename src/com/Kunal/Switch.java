package com.Kunal;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit = in.next();

//        if(fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//
//        if(fruit.equals("apple")){
//            System.out.println("Sweet red fruit");
//
//        }
        // The above if else method can be replaced with switch case

        switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple" :
                System.out.println("Sweet and red Fruit");
                break;

            case "Watermelon":
                System.out.println("Big Juicy fruit");
                break;

            case "Grapes":
                System.out.println("Small Fruit");
                break;


            default:
                System.out.println("Please enter a valid fruit");
        }


        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet and red Fruit");
            case "Watermelon" -> System.out.println("Big Juicy fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
