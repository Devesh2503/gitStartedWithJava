package com.Week8.FileHandeling;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger =
                new Logger();

        logger.log(
                "Application Started"
        );

        logger.log(
                "User logged in"
        );

        logger.log(
                "User logged out"
        );

        View view= new View();
        view.Read();

    }
}

class Logger{
    public void log(String message){
        try{
            FileWriter writer = new FileWriter("app.log",true);
            writer.write(LocalDateTime.now() + " : " + message + "\n");
            writer.close();
        }catch(Exception e){

            System.out.println(
                    "Logging failed"
            );
        }
    }
}

class View{
   void Read(){
       try{
           File file= new File("app.log");
           Scanner sc =new Scanner(file);

           while(sc.hasNextLine()){
               System.out.println(sc.nextLine());
           }

           sc.close();

       }catch(Exception e){
           System.out.println("Error Reading file");
       }
   }
}
/*
1. What Does This Mean?

Normally:

new FileWriter("app.log")

OVERWRITES old file content.

But:

new FileWriter("app.log", true)

APPENDS new data at the END of file.
 */