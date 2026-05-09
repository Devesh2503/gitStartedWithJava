package com.Week8.FileHandeling;
import java.io.*;
public class Writing {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("log.txt");
            writer.write(
                    "User logged in Sucessfully"
            );
            writer.close();
        }catch(IOException e){
            System.out.println(
                    "Error Writing file"
            );
        }
    }
}


/*
When Java sees:

new FileWriter("log.txt")

Java:

Searches for file
If file missing → creates file
Opens connection to file
Prepares stream for writing text
 */