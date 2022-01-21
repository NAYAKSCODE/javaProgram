package javaPracticeday3;

public class Reversethestringinanarray {

	public static void main(String[] args) {
		String str="wellcome to india";
		String[] strarray = str.split(" ");
      for(int i=0;i<strarray.length;i++)
      {
    	  String s = strarray[i];
    	  for(int j=s.length()-1;j>=0;j--)
    	  {
    		  System.out.print(s.charAt(j));
    	  }
    	  System.out.print(" ");
      }
	}

}
