package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers 
{
	public static void main(String[] args) 
	{

        int temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int first = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int second = sc.nextInt();

        System.out.println(  " Before Swapping "  );
        System.out.println("First Number= "+first+" ,Second Number= "+second);
        temp = first;
        first = second;
        second = temp;

        System.out.println(  " After Swapping"  );
        System.out.println("First Number= "+first+" ,Second Number= "+second);
	}

}
