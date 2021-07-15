import java.util.*;
public class Number62 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		Number62 nm=new Number62();
		if(nm.work(n)&&nm.work(n))
			System.out.println("Prime palindrome");
		else
			System.out.println("Not Prime palindrome");
	}
	boolean work(int n)
	{
		int i,c=0;
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				c++;
		}
		if(c>0||n==1)
			return false;
		else
			return true;
	}
	boolean work(double n)
	{
		int d,rev=0,dup=(int)n;
		while(n!=0)
		{
			d=(int)n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(dup==rev)
			return true;
		else
			return false;
	}
}
