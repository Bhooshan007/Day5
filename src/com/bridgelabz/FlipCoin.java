package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times coin to be fliped");
		int numOfTimes = sc.nextInt();
		int head = 0;
		int tails = 0;
		
		for(int i = 0; i < numOfTimes; i++)
		{
			double flip = Math.random();
			if(flip < 0.5)
			{
				head++;
			}
			else
			{
				tails++;
			}
		}
		System.out.println("Head :"+head);
		System.out.println("Tails :"+tails);
		
		double percentageOfHead = (head*100)/numOfTimes;
		double percentageOfTails = (tails*100)/numOfTimes;
		
		System.out.println("Percentage Of Head"+percentageOfHead);
		System.out.println("Percentage Of Tails"+percentageOfTails);
	}

}
