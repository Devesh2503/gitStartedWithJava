package com.ArrayList;
import java.util.*;
public class TcsNqt {
    public static void main(String[] args){

        //First();
        int[] a =Second();
        System.out.println(Arrays.toString(a));



    }

    static void First(){
        Scanner in =new Scanner(System.in);
        String input =in.nextLine();

        input = input.replace("[","");
        input =input.replace("]","");

        String[] parts = input.split(",");

        int[] array = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            array[i]=(int)parts[i].trim().charAt(0)-(int)'0';

            //array[i]=Integer.parseInt(parts[i].trim());

        }

        for(int num : array){
            System.out.print(num +" ");
        }
    }

    static int[] Second(){
        Scanner in= new Scanner(System.in);
        String input = in.nextLine();
        int[] arr = new int[1000];
        int n=input.length();
        int cnt=0;
        for(int i=1;i<=n-2;i++){
            if(input.trim().charAt(i) == ','){

            }else{

               arr[cnt]=input.trim().charAt(i)-'0';
               cnt++;
            }
        }

        int[] a=new int[cnt];
        for(int i=0;i<cnt;i++){
            a[i]=arr[i];
        }
        return a;
    }

}
