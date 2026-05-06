package com.Revision.String;

public class Advance {
    public static void main(String[] args) {

    }

    static void String_Builder(){

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println(sb); // Hello World
    }

    static void Create(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
    }

    static void Append(){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println(sb); // Hello World
    }

    static void Insert(){
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(5, " World");

        System.out.println(sb); // Hello World
    }

    static void Replace(){
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(0, 5, "Hi");
//👉 start = included, end = excluded (same as substring)
        System.out.println(sb); // Hi World
    }

    static void Delete(){
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(5, 11);
        //👉 start = included, end = excluded (same as substring)
        System.out.println(sb); // Hello
    }

    static void deleteCharAt(){
        StringBuilder sb = new StringBuilder("Java");
        sb.deleteCharAt(1);

        System.out.println(sb); // Jva
    }

    static void Reverse(){
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();

        System.out.println(sb); // avaJ
    }

    static void charAt(){
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.charAt(2)); // v
    }

    static void convertToString(){
        StringBuilder sb = new StringBuilder("Hello");
        String str = sb.toString();
    }
}

//word.setLength(0); we can use this to clear string Builder
// what does toCharArray do
/*
🔥 Problem with String
In Java, String is immutable
👉 Once created, it cannot change

String s = "Hello";
s = s + " World";

❗ What actually happens:

"Hello" → object 1
"Hello World" → object 2

👉 Old object stays in memory → waste + slow


Solution → StringBuilder

👉 StringBuilder is mutable (can change)
 */