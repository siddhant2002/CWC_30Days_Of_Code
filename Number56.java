import java.util.*;
public class Number56 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s,d;
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>=9)
		{
			s=0;
			while(n!=0)
			{
				d=n%10;
				s=s+d;
				n/=10;
			}
			n=s;
		}
		if(n==1)
			System.out.println("Magic number");
		else
			System.out.println("Not Magic number");
	}
}
