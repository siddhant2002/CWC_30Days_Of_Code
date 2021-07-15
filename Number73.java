import java.util.*;
public class Number73 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		double s=0,x;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		for(i=1,j=1;i<=n;i++,j+=2)
		{
			if(i%2==1)
				s=s+((x*j)/fac(j));
			else
				s=s-((x*j)/fac(j));	
		}
		System.out.println("The sum of the series is "+s);
	}
	static int fac(int i)
	{
		if(i==1)
			return 1;
		else
			return i*fac(i-1);
	}
}
