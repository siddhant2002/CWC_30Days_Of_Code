import java.util.*;
public class Number68 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,k,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the specified cutting point");
		k=sc.nextInt();
		if(k>n||k<0)
			System.out.println("Invalid position");
		else
		{
			int b[]=new int[k];
			for(i=0;i<k;i++)
			{
				b[i]=a[i];
			}
			for(j=0;i<n;i++,j++)
			{
				a[j]=a[i];
			}
			for(i=0;j<n;j++,i++)
			{
				a[j]=b[i];
			}
		}
		System.out.println("The changed array is ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
