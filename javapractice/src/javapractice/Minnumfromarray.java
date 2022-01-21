package javapractice;

public class Minnumfromarray {

	public static void main(String[] args) {
		int[] arr= {34,45,23,5,37,223,78};
       int min=arr[0];
       for(int i=1;i<arr.length;i++)
       {
    	   if(arr[i]<min)
    	   {
    		   min=arr[i];
    	   }
       }
       System.out.println(min);
	}

}
