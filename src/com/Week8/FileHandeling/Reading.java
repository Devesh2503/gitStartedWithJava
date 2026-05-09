package com.Week8.FileHandeling;
import java.io.*;
import java.util.Scanner;
public class Reading {
    public static void main(String[] args) {
        try{
            File file =new File("log.txt");  //👉 “Create a Java object that REPRESENTS the file path log.txt”
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch (Exception e){
            System.out.println(
                    "Error reading file"
            );
        }
    }
}


/*
3. Important Understanding About File Location

This:

new File("log.txt")

means:

👉 Java searches file in project root folder.

Usually:

first-program/

folder.

NOT inside package automatically.
 */