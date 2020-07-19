import java.util.*;
public class binarysearch 
{
	int search(int a[] , int beg , int end , int e)
	{
	    int mid;
	    while (beg<=end)
	    {
	            mid=(beg+end)/2;
	        if (a[mid]==e)
	        {
	            return mid;
	        }
	        else if (a[mid]>e)
	        {
	            return search(a , beg ,mid-1,e );
	        }
	        else if (a[mid]<e)
	        {
	            return search(a,mid+1,end,e);

	        }
	    }
	    return 1;
	}
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
		int beg=0;
		int end=n-1;
		binarysearch ob=new binarysearch();
		int r=ob.search(a, beg, end, e);
		System.out.println(r);
	}
}
