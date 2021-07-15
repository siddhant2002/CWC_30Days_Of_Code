import java.math.*;
public class Number98 {

	public static void main(String[] args) {
		Number98 nm=new Number98();
		for(long i=1;i<=50000;i++)
		    nm.digit(i);
	}
	BigInteger nm=new BigInteger("1");
	void digit(long n)
	{
		long dup=n,d,s=0;
		while(n!=0)
		{
			d=n%10;
			s=s+factorial(d);
			n/=10;
		}
		if(s==dup)
			nm=nm.add(BigInteger.valueOf(dup));
		if(dup==1000000000)
			System.out.println(nm);
	}
	long factorial(long n)
	{
		long i,f=1;
		for(i=1;i<=n;i++)
			f*=i;
		return f;
	}
}
