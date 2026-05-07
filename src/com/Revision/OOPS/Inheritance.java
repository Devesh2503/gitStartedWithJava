package com.Revision.OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.name = "Rahul";
        dev.id = 101;

        dev.programmingLanguage = "Java";

        dev.work();   // Parent method
        dev.code();   // Child method
    }
}

// Parent Class
 class Employee {
    String name;
    int id;

    public void work() {
        System.out.println("Employee working");
    }
}


//child Class

class Developer extends Employee {

    String programmingLanguage;

    public void code() {

        System.out.println(
                name + " is coding in " +
                        programmingLanguage
        );

    }

}
/*
Inheritance means:
One class takes properties from another class.
Parent → Child
*/