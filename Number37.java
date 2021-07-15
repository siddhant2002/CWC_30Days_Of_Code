import java.util.*;
public class Number37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,k,l,f=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-3;i++)
		{
			S:
			for(j=i+1;j<n-2;j++)
			{
				for(k=j+1;k<n-1;k++)
				{
					for(l=k+1;l<n;l++)
					{
						if((a[i]^a[j]^a[k]^a[l])==0)
						{
							f=1;
							break S;
						}
					}
				}
			}
		}
		if(f==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
