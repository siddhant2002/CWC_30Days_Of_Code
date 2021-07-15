import java.util.*;
public class Number51 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		long i,d,rev=0,dup;
		boolean k=true;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=(long)n+1;k;i++)
		{
			dup=i;
			rev=0;
			while(dup!=0)
			{
				d=dup%10;
				rev=rev*10+d;
				dup/=10;
			}
			if(rev==i)
				k=false;
		}
		System.out.print("Next smallest palindrome:"+rev);
	}
}
