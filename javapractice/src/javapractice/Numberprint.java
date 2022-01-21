package javapractice;

import java.util.Scanner;

public class Numberprint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n%5==0 && n%3==0)
		{
			System.out.println("goodbye");
		}
		else if(n%5==0)
		{
			System.out.println("bye");
		}
		else if (n%3==0)
		{
			System.out.println("hello");
		}

	}

}
