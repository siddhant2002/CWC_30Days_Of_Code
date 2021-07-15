import java.util.*;
public class Number81 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,s=0,s1=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n%2==0)
		{
			for(i=0,j=n/2;i<n/2;i++,j++)
			{
				s=s+a[i];
				s1=s1+a[j];
			}
			if(s!=s1)
			{
				if(s>s1)
				{
					boolean x=true;
					while(x)
					{
						int p=s-s1;
						for(i=0;i<n/2;i++)
						{
							if(p==a[i])
							{
								System.out.println("To make the array balance we need to add"+p);
								x=false;
							}
						}
						if(x==true)
						{
							System.out.println("Array can't be balanced");
							x=false;
						}
					}
				}
				else 
				{
					boolean x=true;
					while(x)
					{
						int p=s-s1;
						for(i=n/2;i<n;i++)
						{
							if(a[i]==p)
							{
								System.out.println("To make the array balance we need to add"+p);
								x=false;
							}
						}
						if(x==true)
						{
							System.out.println("Array can't be balanced");
							x=false;
						}
					}
				}
			}
			else
				System.out.println("The array is balanced");
		}
		else
		{
			for(i=0,j=n/2;i<n/2;i++,j++)
			{
				s=s+a[i];
				s1=s1+a[j];
			}
			if(s!=s1)
			{
				if(s>s1)
				{
					boolean x=true;
					while(x)
					{
						int p=s-s1;
						for(i=0;i<n/2;i++)
						{
							if(p==a[i])
							{
								System.out.println("To make the array balance we need to add"+p);
								x=false;
							}
						}
						if(x==true)
						{
							System.out.println("Array can't be balanced");
							x=false;
						}
					}
				}
				else 
				{
					boolean x=true;
					while(x)
					{
						int p=s-s1;
						for(i=n/2;i<n;i++)
						{
							if(a[i]==p)
							{
								System.out.println("To make the array balance we need to add"+p);
								x=false;
							}
						}
						if(x==true)
						{
							System.out.println("Array can't be balanced");
							x=false;
						}
					}
				}
			}
			else
				System.out.println("The array is balanced");
		}
	}
}
