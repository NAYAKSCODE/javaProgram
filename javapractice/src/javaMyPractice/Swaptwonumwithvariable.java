package javaMyPractice;

import java.util.Scanner;

public class Swaptwonumwithvariable {

	public static void main(String[] args) {
		/*
		int a=10;
		int b=20;
		int temp=a;
		      a=b;
		      b=temp;
		      System.out.println(a+","+b);
*/
	/*	
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		*/
		/*
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scn.nextLine();
		System.out.println("Enter the age");
		int age = scn.nextInt();
		System.out.println("Enter the mobilenum");
		long mobilenum = scn.nextLong();
		System.out.println("Enter the salary");
		double salary = scn.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(mobilenum);
		System.out.println(salary);
		*/
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
