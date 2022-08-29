package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder 
{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend number: ");
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor number: ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is = "+quotient);
        System.out.println("The Remainder is = "+remainder);
    }

}
