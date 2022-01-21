 package Javapracticeday2;

import java.util.LinkedHashSet;

public class DemostringTesterpositionofch {
	public static void main(String[] args) {
		String s="Tester";
		s=s.toLowerCase();
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for (Character character : set) 
	{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(character == s.charAt(i))
		{
			count++;
		}
	}
	System.out.println(character+"");	
	}
	}
}
