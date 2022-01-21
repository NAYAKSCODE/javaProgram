package javapractice;

public class Maxelefromarray {
	public static void main(String[] args) {
		int[] arr= {10,40,6,78,30,25};
		// initialized the max element 
		int max=arr[0];
		//traverse the arry and compare with the other 
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			max=arr[i];	
			
			}
			
		}
		System.out.println(max);
	}

}
