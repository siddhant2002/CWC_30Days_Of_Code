import java.util.*;
public class Number39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of testcases");
		n=sc.nextInt();
		while(--n>=0)
		{
			int a,b,i,c=0,j;
			System.out.println("Enter the lower range and upper range");
			a=sc.nextInt();
			b=sc.nextInt();
			for(i=a;i<=b;i++)
			{
				c=0;
				for(j=2;j<=(int)Math.sqrt(i);j++)
				{
					if(i%j==0)
						c++;
				}
				if(c==0&&i!=1)
					System.out.println(i);
			}
		}
	}
}
