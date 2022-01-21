package javaMyPractice;

public class ThreeDArrayPrint {
	public static void main(String[] args) {
		int a[][][]= {{{20,30,40},{50,70,60}},{{10,49,36},{45,67,34}}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
			System.out.println();
			}
		}
	}

}
