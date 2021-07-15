import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0,a=0,b=1,c,i;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		if(n==1)
			System.out.println("The sum is "+s);
		else if(n==2)
			System.out.println(s=1);
		else
		{
			s=1;
			for(i=3;i<=n;i++)
			{
				c=a+b;
				s+=c;
				a=b;
				b=c;
			}
			System.out.println("The sum is "+s);
		}
	}
}
