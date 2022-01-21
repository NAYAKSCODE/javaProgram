package javapractice;

import java.util.LinkedHashSet;

public class Gettheduplicatefromtheststement {
public static void main(String[] args) {
	String s="iron man is iron man";
	String[] sarray = s.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	for(String word:sarray)
	{
		set.add(word);
	}
	for (String word : set) {
		int count=0;
	for(int i=0;i<sarray.length;i++)
	{
		if(word.equals(sarray[i]))
		{
			count++;
		}
		if(count>1)
			
		{
			System.out.print(word);
		}
			
	}
	}
}
}
