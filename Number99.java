import java.util.*;
public class Number99 {

	public static void main(String[] args) {
		int n=100000;
        Prime(n);
	}
	static int Rotate(long n)
    {
        long r=n%10;
        r*=Math.pow(10,count(n));
        n /= 10;
        n+=r;
        return (int) n;
    }
	static void Prime(long n)
	{
        long b=(n-2)/2;
        boolean m[]=new boolean[(int)(b + 1)];
        Arrays.fill(m,false);
        store(m,b);
        System.out.print("2 ");
        for (long i=1;i<=b;i++) 
        {
            if (m[(int) i] == true)
                continue;
            long a=2*i+1;
            a=Rotate(a);
            while (a!=2*i+1)
            {
                if (a%2==0)
                    break;
                if (m[(int)((a-1)/2)]==false)
                    a= Rotate(a);
                else
                    break;
            }
            if (a==((2*i)+1))
                System.out.print(a+" ");
        }
    }
    static int count(long n)
    {
        long d=0;
        while ((n/=10)>0)
        {
        	d++;
        }
        return (int)d;
    }
    static void store(boolean marked[],long n)
    {
        for (long i=1;i<=n;i++)
        {
        	for (long j=i;(i+j+(2*i*j))<=n;j++)
        	{
        		marked[(int)(i+j+(2*i*j))] = true;
        	}
        }
    }
}