package com.Revision.String;

public class Main {
    public static void main(String[] args) {

    }

    static void basics(){
        //There are two ways to create Strings.

        String name = "Java";
        name = name + " Developer";
//        String name1= new String("Java");

        // to get length
        System.out.println(name.length());

        String password = "abc123";
        if(password.length() <3) {
            System.out.println("Password too short");
        }else{
            System.out.println("Password too long");
        }


        // Gets character at position.
        System.out.println(name.charAt(0));

        //if(name == "Java")
        // This compares memory address not content
        // correct way is to use equals property

        if(name.equals("Java")) {
            System.out.println("Match");

            //Real Job Example — Login Check

            String storedPassword = "admin123";
            String enteredPassword = "admin123";

            if(enteredPassword.equals(storedPassword)) {

                System.out.println("Login Success");

            }
            else {

                System.out.println("Invalid Password");

            }

            //equalsIgnoreCase()

            String role = "admin";

            if(role.equalsIgnoreCase("ADMIN")) {

                System.out.println("Access granted");

            }


        }

    }


    static void Case(){
//toUpperCase()
        String name = "java";
        System.out.println(name.toUpperCase());

        //toLowerCase()
        String email = "USER@GMAIL.COM";
        email = email.toLowerCase();
    }

    static void contains(){
        //Checks if text exists.
        //String email = "test@gmail.com";
        String email="ssdfd";

        if(email.contains("@gmail.com")) {

            System.out.println("Valid Gmail");

        }
    }

    static void sub_String(){
        //String substring(int beginIndex)
        //Takes from beginIndex → till end

        String str = "HelloWorld";
        String result = str.substring(5);

        System.out.println(result);

        // Two parameters Substring
        //String substring(int beginIndex, int endIndex)
//        👉 Takes from beginIndex → (endIndex - 1)
//        👉 endIndex is excluded

        String str1= "HelloWorld";
        String result1 = str1.substring(0, 5);

        System.out.println(result1);

        // if index is out of bound then it give error

//✅ Extract file extension
        String file = "image.png";
        String ext = file.substring(file.indexOf(".") + 1);

        System.out.println(ext); // png

        //✅ Mask sensitive data
        String phone = "9876543210";
        String masked = "******" + phone.substring(6);

        System.out.println(masked); // ******3210

        // if begining and end is same then it gives an empty string
    }


    static void use_Trim(){
        //Removes extra spaces.
        String name = "  Java  ";
        name = name.trim();
        ///  o/P Java
    }
}

/*
You might think:
Java → Java Developer

But internally:

New object created
Old object stays
 */