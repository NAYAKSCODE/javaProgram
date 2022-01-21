package javapractice;

public class Reversethestring {
	public static void main(String[] args) {
		//type-1 with build in function
		/*String s="AShutosh";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		*/
		//type-2 with out build in function
		String s="Ashutosh";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			System.out.println(reverse);
		}
		
		/*
		//type-3 with out using length() by use the string length
		String s="Ashutosh";
		char[] sarray = s.toCharArray();
		for(int i=sarray.length-1;i>=0;i--)
		{
			System.out.print(sarray[i]+" ");
		}
		*/
		//Type-4
		/*
		String s="Ashutosh";
		char[] sarray = s.toCharArray();
		for(int i=sarray.length-1;i>=0;i--)
		{
			System.out.print(sarray[i]+" ");
		}
		System.out.println();
		int count=0;
		for(char ch:sarray)
		{
			count++;
		}
		System.out.println("length of array=" + count);
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(sarray[i]);
		}
		/*
		String s="Ashutosh";
		String reverse=" ";
		char[] sarray = s.toCharArray();
		for(int i=sarray.length-1;i>=0;i--)
		{
			System.out.print(sarray[i]+" ");
		}
		*/
	}

}
