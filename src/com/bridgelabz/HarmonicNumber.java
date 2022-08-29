package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	 {
	        double result = 0;
	        double num = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the harmonic number you want to find: ");

	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            num = num + ((float) 1/i);
	            result = num;
	            System.out.println(result);
	        }
	        System.out.println("The value of Harmonic no. "+n+" is: "+result);
	  }

}
