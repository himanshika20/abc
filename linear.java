import java.util.Scanner;

public class linera 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int e=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==e)
			{
				System.out.println(i);
			}
		}
		
	}

}
