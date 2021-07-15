import java.util.*;
public class Number66 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s=0,s1=0;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<=n-1;i++)
		{
			if(i%2==1)
			{
				System.out.print(s+",");
				s+=7;
			}
			else
			{
				System.out.print(s1+",");
				s1+=6;
			}
		}
		if(i%2==1)
		{
			System.out.println(s);
		}
		else
		{
			System.out.println(s1);
		}
	}
}
