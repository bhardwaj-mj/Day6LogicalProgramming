package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class PrimeNumber {
    static void isPrime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int number= sc.nextInt();
        isPrime(number);
    }
}
