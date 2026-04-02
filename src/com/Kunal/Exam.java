package com.Kunal;
import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");

        String[] nums = input.split(",");

        int sum = 0;
        for(String num : nums){
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
    }
}
