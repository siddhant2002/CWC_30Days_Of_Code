import java.math.BigInteger;
public class Number100 {

	public static void main(String[] args) {
		Number100 nm=new Number100();
		for(int i=1;i<=1000000;i++)
		    nm.palindromeN(i);
	}
	BigInteger nm=new BigInteger("1");
	void palindromeN(int n)
	{
		int dup=n,d,rev=0;
		while(n!=0)
		{
			d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(rev==dup||palindromeB(Integer.toBinaryString(dup)))
			nm=nm.add(BigInteger.valueOf(dup));
		if(dup==1000000)
			System.out.println(nm);
	}
	boolean palindromeB(String n)
	{
		StringBuffer nm=new StringBuffer();
		nm.append(n);
		nm=nm.reverse();
		if(nm.toString().equals(n))
			return true;
		else
			return false;
	}
}
