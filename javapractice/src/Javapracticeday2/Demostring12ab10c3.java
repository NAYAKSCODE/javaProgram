package Javapracticeday2;

public class Demostring12ab10c3 {
public static void main(String[] args) {
	String s="12ab10c3";
	int sum=0;
	int Tsum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0'&& s.charAt(i)<='9')
		{
			int n = s.charAt(i)-48;
			sum=sum*10+n;
		}
		else
		{
			Tsum=Tsum+sum;
			sum=0;
		}
	}
	
System.out.println(Tsum+sum);
}
}
