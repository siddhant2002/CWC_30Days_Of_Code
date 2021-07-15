import java.util.*;
public class Number60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c,i,j,r1,c1,d;
		System.out.println("Enter number of rows and columnns of the 1st array");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("The values of the 1st array is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=(int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter number of rows and columnns of the 2st array");
		r1=sc.nextInt();
		c1=sc.nextInt();
		int a1[][]=new int[r1][c1];
		System.out.println("The values of the 2nd array is ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a1[i][j]=(int)(Math.random()*100);
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		if(c==r1)
		{
			int a2[][]=new int[r][c1];
			for(i=0;i<r;i++)
			{
				for(j=0;j<c1;j++)
				{
					a2[i][j]=0;
					for(d=0;d<c;d++)
					{
						a2[i][j]+=(a[i][d]*a1[d][j]);
					}
				}
			}
			System.out.println("The multiplication of the matrix is ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print(a2[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("The multiplication of the matrix is not possible");
		}
	}
}