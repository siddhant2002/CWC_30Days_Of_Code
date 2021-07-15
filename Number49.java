import java.util.*;
public class Number49 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,b,k;
		System.out.println("Enter number of lines");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(b=2*(n-i);b>=1;b--)
				System.out.print(" ");
			for(k=1;k<i;k++)
				System.out.print("* ");
			System.out.println("*");
		}
	}
}
