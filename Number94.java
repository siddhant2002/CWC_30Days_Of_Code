import java.util.*;
public class Number94 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("Enter the lower range and upper range");
		n=sc.nextInt();
		m=sc.nextInt();
		if(n>m)
			System.out.println("Invalid");
		else
		{
			int y=1;
			long k=m+1;
			while(y!=((m+1)-n))
			{
				y=work(n,m,k);
				k+=1;
			}
			System.out.println(k-1);
		}
	}
	static int work(int n, int m, long a)
	{
		int i,c=0;
		for(i=n;i<=m;i++)
		{
			if(a%i==0)
				c++;
		}
		return c;
	}
}
