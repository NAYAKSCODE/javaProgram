package javapractice;

import java.util.LinkedHashSet;

public class Printtheduplicatechar {
	public static void main(String[] args) {
		
	
	String s="Ashutosh";
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(char ch:set)
	{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(ch==s.charAt(i))
		{
			count++;
		}
		
	}
	if(count>1)
	{
		System.out.print(ch+" ");
	}
	//System.out.print(ch +" "+ count);
	}
	
}

}