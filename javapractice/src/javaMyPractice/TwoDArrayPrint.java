package javaMyPractice;

public class TwoDArrayPrint {
	public static void main(String[] args) {
		int[][] a= {{20,40,60},{10,30,50}};
		//type-1 for loop
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
		}
	}


