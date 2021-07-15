import java.util.*;
public class Number82 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,c=0,c1=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==0)
				c++;
			else if(a[i]==1)
				c1++;
		}
		if(c==n||c1==n)
			System.out.println(-1);
		else
			for(i=0;i<n;i++)
			{
				if(a[i]==1)
				{
					System.out.println(i);
					break;
				}
			}
	}
}
