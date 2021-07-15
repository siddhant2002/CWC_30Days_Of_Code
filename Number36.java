import java.util.*;
import java.math.*;
public class Number36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			BigInteger a,b,c,d;
			a=fac(2*i);
			b=fac(i);
			c=fac(i-1);
			d=a.divide(b.multiply(c));
			System.out.print(d+" ");
		}
	}
	static BigInteger fac(int n)
	{
		int i;
		BigInteger nm=new BigInteger("1");
		for(i=1;i<=n;i++)
		{
			nm=nm.multiply(BigInteger.valueOf(i));
		}
		return nm;
	}
}
