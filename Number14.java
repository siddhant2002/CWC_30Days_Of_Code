import java.util.*;

public class Number14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,f=0,j;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		if(n<=10)
		{
			for(i=1;i<10;i++)
				System.out.print(i+" ,");
			System.out.println(i);
		}

		else
		{
			for(i=1;i<=10;i++)
				System.out.print(i+",");
			if(n%2==0)
			{
				for(j=12;i<n-1;i+=2)
				{
					System.out.print(j+",");
					StringBuffer nm=new StringBuffer();
					nm.append(String.valueOf(j));
					nm.reverse();
					j=Integer.parseInt(nm.toString());
					System.out.print(j+",");
					j+=2;
				}
				System.out.print(j+",");
				StringBuffer nm=new StringBuffer();
				nm.append(String.valueOf(j));
				nm.reverse();
				j=Integer.parseInt(nm.toString());
				System.out.println(j);
			}
			else
			{
				for(j=12;i<n;i+=2)
				{
					System.out.print(j+",");
					StringBuffer nm=new StringBuffer();
					nm.append(String.valueOf(j));
					nm.reverse();
					j=Integer.parseInt(nm.toString());
					System.out.print(j+",");
					j+=2;
				}
				System.out.println(j);
			}
		}
	}
}
