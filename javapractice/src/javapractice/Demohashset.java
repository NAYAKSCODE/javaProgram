package javapractice;

import java.util.HashSet;

public class Demohashset {
	public static void main(String[] args) {
	HashSet hashset = new HashSet<>();	
	hashset.add(10);
	hashset.add(30);
	hashset.add(50);
	hashset.add(70);
	hashset.add(70);
	hashset.add(60);
	hashset.add("ashutosh123");
	hashset.add(20.5f);
	hashset.add(20.5d);
	hashset.add(null);
	
	System.out.println(hashset);
	}
	

}
