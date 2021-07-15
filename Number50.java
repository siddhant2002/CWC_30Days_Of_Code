import java.util.*;
public class Number50 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,i,c=0;
		System.out.println("Enter the lower limit and upper limit");
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a+1;i<b;i++)
		{
			if(prime(i))
				c++;
		}
		System.out.println("Number of primes are "+c);
	}
	static boolean prime(int n)
	{
		int i,c=0;
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				c++;
		}
		if(c!=0)
			return false;
		else
			return true;
	}
}
