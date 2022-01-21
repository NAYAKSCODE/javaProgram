package javaMyPractice;

public class OneDArrayPrint {
	public static void main(String[] args) {
		int[] a= {10,30,20,50};
		//type-1
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		*/
		//type-2
		/*for (int i : a) {
			System.out.print(i+" ");
		}
		*/
		int i=0;
		while(i<a.length)
		{
			System.out.print(a[i]+" ");
			i++;
		}
	}

}
