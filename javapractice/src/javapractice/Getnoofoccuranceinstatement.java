package javapractice;

import java.util.LinkedHashSet;

public class Getnoofoccuranceinstatement {
	public static void main(String[] args) {
		String s="i am a hero and am special";
		String[] sarray = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(String word:sarray)
		{
		set.add(word);
	     }
		for (String word2 : set) {
			int count=0;
			for (String word3 : sarray) {
				if(word2.equals(word3))
				{
					count++;
				}
				
			}
			System.out.println(word2+" "+count);
		}
		}
}
// convert the statement into  an array
//cerate a set
//add all the element of an array to set
//compare elements of set with the elements of array and get the count

