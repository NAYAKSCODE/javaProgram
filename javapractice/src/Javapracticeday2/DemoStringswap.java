package Javapracticeday2;

public class DemoStringswap {
	public static void main(String[] args) {
		String s="welcome to india";
		String[] str = s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		for(int i=0;i<s.length();i++)
		{
			System.out.print(str [i]+" ");
		}
	}

}
