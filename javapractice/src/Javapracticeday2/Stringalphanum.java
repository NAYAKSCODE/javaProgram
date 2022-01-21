package Javapracticeday2;

public class Stringalphanum {
public static void main(String[] args) {
	String s="ab123@x3";
	String al="";
	String num="";
	String sc="";
	String sum;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			al=al+s.charAt(i);
		}
		else if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			num=num+s.charAt(i);
		}
		else
		{
			sc=sc+s.charAt(i);
		}
		
		
	}
	System.out.println(al+num+sc);
}
}
