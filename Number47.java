import java.util.*;
public class Number47 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s=0,d,dup;
		System.out.println("Enter a number");
		n=sc.nextInt();
		dup=n;
		while(n!=0)
		{
			d=n%10;
			s=s+(int)Math.pow(d,3);
			n/=10;
		}
		if(dup==s)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
