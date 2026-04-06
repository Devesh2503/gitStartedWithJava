package com.Kunal;

public class Loops {
    public static void main(String[] args){
        // Print numbers from 1 to 10
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
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