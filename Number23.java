import java.util.*;
public class Number23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,n1,i;
		System.out.println("Enter the size of 1st array");
		n=sc.nextInt();
		System.out.println("Enter "+n+" numbers");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		n1=sc.nextInt();
		System.out.println("Enter "+n1+" numbers");
		int b[]=new int[n1];
		for(i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
		}
		if(n1==0)
		{
			for(i=0;i<n;i++)
				System.out.print(a[i]+" ");
		}
		else if(n==0)
		{
			for(i=0;i<n1;i++)
				System.out.print(b[i]+" ");
		}
		else if(n==n1)
		{
			for(i=0;i<n;i++)
				System.out.print(a[i]+" "+b[i]+" ");
		}
		else if(n>n1)
		{
			for(i=0;i<n1;i++)
				System.out.print(a[i]+" "+b[i]+" ");
			for(;i<n;i++)
				System.out.print(a[i]+" ");
		}
		else if(n<n1)
		{
			for(i=0;i<n;i++)
				System.out.print(a[i]+" "+b[i]+" ");
			for(;i<n1;i++)
				System.out.print(b[i]+" ");
		}
	}
}
