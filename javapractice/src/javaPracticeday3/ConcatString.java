package javaPracticeday3;

public class ConcatString {

	public static void main(String[] args) {
		String s="abc"+"xyz";
	for(int i=0;i<s.length()/2;i++)
	{
		System.out.print(s.charAt(i)+""+s.charAt(s.length()/2+i));
	}

	}

}
//1st itreation i=0 and i=3+0=3
//"a"+"x"

//2nd itreation i=1 and i=3+1=4
//"b"+"y"

//3rd itreation i=2 and i=3+2=5