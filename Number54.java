import java.util.Scanner;
public class Number54 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,b,k,m=0;
		System.out.println("Enter number of lines");
		n=sc.nextInt();
		for(i=n;i>=1;i-=2,m++)
		{
			for(b=1;b<=m;b++)
				System.out.print(" ");
			for(k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		m=n-m-1;
		for(i=3;i<=n;i+=2,m--)
		{
			for(b=1;b<=m;b++)
				System.out.print(" ");
			for(k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
