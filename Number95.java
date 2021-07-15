public class Number95 {

	public static void main(String[] args) {
		int i;
		long s=2;
		for(i=3;i<=2000000;i+=2)
		{
			if(prime(i))
				s+=i;
		}
		System.out.println("The sum is "+s);
	}
	static boolean prime(int n)
	{
		int i,c=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
			if(c>2)
				break;
		}
		if(i==n+1)
			return true;
		else
			return false;
	}
}
