import java.util.*;
public class Number32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("Enter two numbers");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("The binomial coefficient is "+(double)(fact(n)/(double)((fact(m)*fact(n-m)))));
	}
	static int fact(int n)
	{
		int i,f=1;
		for(i=2;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}
}
