package com.Kunal;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch(empId){
            case 1:
                break;
            case 2:
                break;
            case 3 :
                switch (department){
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "CSE":
                        System.out.println("CSE");
                        break;
                    case "ECE":
                        System.out.println("Chutiya Department");
                        break;
                    default:
                        System.out.println("Choose any dep");
                }
                break;
            default:
                System.out.println("None");
        }
    }
}
