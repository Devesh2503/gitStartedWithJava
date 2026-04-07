package com.Kunal;

public class Loops {
    public static void main(String[] args){
        // Print numbers from 1 to 10
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }

        // while loop

        int num=1;
        while(num<=5){
            System.out.println(num+" ");
            num+=1;
        }

        // do while loop
        // here in do while loop the loop will execute at least once
        int n=10;
        do{
            System.out.print(n+" ");
            n++;
        }while(n<10);
        {
            System.out.print(n+" ");
            n++;
        };
    }
}

class ConditionalStatements{
    /*
        Syntax of if statements:

        if(boolean expression T or F){
        //body
        } else{
        //body
        }
        */
    void statements() {
        int salary = 25_400;
        if (salary > 10_000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }


        ///  multiple if else statement
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }


    }
}