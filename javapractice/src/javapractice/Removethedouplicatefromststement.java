package javapractice;

import java.util.LinkedHashSet;

public class Removethedouplicatefromststement {

	public static void main(String[] args) {
	String s="my name is ashutosh and my name king also";
	String[] sarray = s.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<String>();
for(String word:sarray)

	{
		set.add(word);
	}
	for (String word1 :set) {
	System.out.print(word1+" ");
			
		}
		
	}

	}


