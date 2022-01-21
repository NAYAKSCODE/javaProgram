package javapractice;

public class Demoarryacending {
public static void main(String[] args) {
	int [] arr2={7,5,4,2,1,6};
	int maxvalue=0 ,minvalue=0;
	for(int i=0;i<arr2.length;i++)
	{
		for(int j=1;j<arr2.length;j++)
		{
		if(arr2[i]<arr2[j])
		{
			int temp=arr2[i];
			arr2[i]=arr2[j];
			arr2[j]=temp;
		}
		
		}
		System.out.println(arr2[1]+" ");
		maxvalue = arr2[arr2.length-1];
		minvalue =arr2[0];
	}
	System.out.println();
	System.out.println("min value is"+ minvalue);
	System.out.println("max value is "+maxvalue);
}
}
