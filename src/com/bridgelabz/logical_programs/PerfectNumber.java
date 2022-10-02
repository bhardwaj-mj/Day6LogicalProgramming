package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<number;i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (number == sum) {
            System.out.println(number + " is a perfect number");
        }
        else {
            System.out.println(number + " is not a perfect number");
        }

    }
}
