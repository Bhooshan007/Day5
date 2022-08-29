package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber 
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1 = sc.nextInt();
        
        System.out.print("Enter Second Number :");
        int num2 = sc.nextInt();
        
        System.out.print("Enter Third Number :");
        int num3 = sc.nextInt();
        
        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println("The Largest Number : "+num1);
        }
        else if(num2 >= num1 && num2 >= num3)
        {
            System.out.println("The Largest Number : "+num2);
        }
        else
        {
            System.out.println("The Largest Number : "+num3);
        }
    }

}
