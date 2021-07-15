import java.util.*;
public class Number91 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n,i;
		System.out.println("Enter a number");
		n=sc.nextLong();
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				n/=i;
				i--;
			}
		}
		if(n>1)
			System.out.println("The factor is "+n);
	}
}
