import java.util.*;
public class Number89 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,s,s1,k=0;
		System.out.println("Enter the order of matrix");
		n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter "+(n*n)+" numbers");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[]=new int[(2*n)+2];
		for(i=0;i<n;i++)
		{
			s=0;
			s1=0;
			for(j=0;j<n;j++)
			{
				s=s+a[i][j];
				s1=s1+a[j][i];
			}
			b[k++]=s;
			b[k++]=s1;
		}
		s=0;
		s1=0;
		for(i=0;i<n;i++)
		{
			s=s+a[i][i];
			s1=s1+a[i][n-i-1];
		}
		b[k++]=s;
		b[k++]=s1;
		for(i=0;i<b.length-1;i++)
		{
			if(b[i]!=b[i+1])
				break;
		}
		if(i==b.length-1)
			System.out.println("Magic Square");
		else
			System.out.println("Not Magic Square");
	}
}
