package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int number= sc.nextInt();
        int firstNumber=0;
        int secondNumber=1;
        int nextNumber;
        System.out.println("Fibonacci series  is ");
        System.out.print(firstNumber+" "+secondNumber+" ");
        for(int i=2;i<=number;i++){
            nextNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
            System.out.print(nextNumber+" ");
        }
    }

}
