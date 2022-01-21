package javapractice;

public class Demoarraysumof3minele {
public static void main(String[] args) {
	int[] arr1= {2,1,4,3,7,5};
	for(int i=0;i<arr1.length;i++)// for lenght of array
	{
		for(int j=i+1;j<arr1.length;j++)
		{
			if(arr1[i]>arr1[j])
			{
				int temp = arr1[i];
			     arr1[i]=arr1[j];
				 arr1[j]=temp;
			}
			
		 }
	//System.out.println(arr1[i] +" ");
//	System.out.println("max element "+(arr1.length-1));
	}
	int sum=0;
	for(int i=0;i<3;i++)
	{
		sum =sum+ arr1[i];
	}
	System.out.println("the sum of the 3 min array=" + sum );
}
}
