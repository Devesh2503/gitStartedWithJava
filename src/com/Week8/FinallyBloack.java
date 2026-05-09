package com.Week8;

public class FinallyBloack {
    public static void main(String[] args) {
        try{
            int x=10/0;
        }catch(ArithmeticException e){
            System.out.println("Error");
        }finally{
            System.out.println("Finally block executed");
        }
    }
}

/*
🔥 Output
Error
Finally block executed
 */

/*
🔥 6. finally Block

finally always executes.

Used for:

Closing files
Database connections
Cleanup
 */

class MultipleCatchBlock{
public MultipleCatchBlock(){
    try {

        String s = null;

        System.out.println(s.length());

    } catch (ArithmeticException e) {

        System.out.println("Arithmetic Error");

    } catch (NullPointerException e) {

        System.out.println("Null Error");
    }
}

}


/*
🔥 8. Exception Object Methods
 */