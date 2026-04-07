package com.Kunal;

public class Reverse {
    public static void main(String[] args) {
        long num=12345671;
        long ans =0;

        while(num!=0){
            long rem = num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        System.out.println(ans);
    }
}
