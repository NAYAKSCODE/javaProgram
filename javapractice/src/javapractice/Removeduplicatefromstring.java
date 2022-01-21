package javapractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removeduplicatefromstring {
public static void main(String[] args) {
	String s="hello world";
	 LinkedHashSet set = new LinkedHashSet<>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Object ch:set)
	{
		System.out.print(ch);
	}
	/*
	//type no of occurance 
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
	System.out.print(ch +""+ count);
	}
	*/
}
}
