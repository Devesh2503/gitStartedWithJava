package com.Functions;
import java.util.*;
public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
//        boolean k= isPrime(n);
//        System.out.println(k);

        boolean[] k= SieveExample(n);
        for(int i=0;i<=k.length-1;i++){
            if(k[i]){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }

        if(n==2){
            return true;
        }

        if(n%2==0){
            return false;
        }

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    static boolean[] SieveExample(int n){
        boolean[] isprime =new boolean[n+1] ;

        // initially mark all the elements here as true;
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;

        for(int i=2;i*i<=n;i++){
            if(isprime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    isprime[j]=false;
                }
            }
        }
        return isprime;
    }
}


// print all 3 digits amstrong numbers
// a=153; 1cube+ 5cube+ 3 cube = 153 then it is amstrong number
