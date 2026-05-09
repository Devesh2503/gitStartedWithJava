package com.Week8;

public class ExceptionHandling {

    public static void main(String[] args) {

        try{
            int result =10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        };
        System.out.println("Program Continues");
    }
}
/*
try{
            int result =10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        };
        System.out.println("Program Continues");
 */

/*
What is an Exception?

An exception is an unwanted event/error
that occurs during program execution and interrupts normal flow of program.

🔥 Why Exception Handling?

Without handling:

Program terminates
Bad user experience
Application crashes

With handling:

Errors controlled
Program continues
Better reliability
 */

/*
types of error in java
✅ 1. Compile-Time Errors

Detected during compilation.

Example:

System.out.println("Hello")
Missing semicolon ❌

✅ 2. Runtime Errors (Exceptions)

Occur during execution.

Example:

10 / 0

✅ 3. Logical Errors

Program runs but gives wrong output.

Example:

addition instead of multiplication


🔥 4. Checked vs Unchecked Exceptions
✅ Checked Exceptions

Checked at compile time.

Examples:

IOException
SQLException
FileNotFoundException

Must handle:

try-catch OR throws

✅ Unchecked Exceptions (Runtime)

Occur at runtime.

Examples:

ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
 */

/*
Exception in thread "main"
java.lang.ArithmeticException: / by zero
 */