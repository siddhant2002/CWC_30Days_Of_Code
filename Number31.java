import java.util.*;
public class Number31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,s=0;
		System.out.println("Enter the size of the array");
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
		for(i=0;i<n;i++)
		{
			s=s+a[0][i]+a[n-1][i]+a[i][0]+a[i][n-1];
		}
		System.out.println("Sum ="+(s-(a[0][0]+a[0][n-1]+a[n-1][0]+a[n-1][n-1])));
	}
}
