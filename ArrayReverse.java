import java.util.Arrays;

public class ArrayReverse {

	public static void arrayReverseWithoutOtherArray(int arr[])
	{
		/*for(int i=0;i<arr.length/2;i++)
		{
			int temp = arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i];
			arr[i]=temp;		
		}	*/
		
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
			
		}
	}
	
	public static void MaxOccuringElement(int arr[])
	{
		
		
	}
	
	public static void main(String[]args)
	{
		int arr[]= {1,2,3,4,187,786,567,0};
		arrayReverseWithoutOtherArray(arr);
		/*System.out.println(Arrays.toString(arr));*/
		
	}
}
