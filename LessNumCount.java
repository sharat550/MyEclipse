import java.util.Scanner;

public class LessNumCount {

	public static void main(String[]args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		
		int a[] = new int[n];
		
	    for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	    
	    int num=sc.nextInt();
	    
	    for(int i=0;i<n;i++)
	    {
	    	if(a[i]<num || a[i]==num)
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}
}
