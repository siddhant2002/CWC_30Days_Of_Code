import java.util.*;
public class Number52 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,b,k;
		System.out.println("Enter number of lines");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(b=n-i;b>=1;b--)
				System.out.print(" ");
			System.out.print("C");
			for(b=1;b<i;b++)
				System.out.print(" ");
			System.out.print("W");
			for(b=1;b<i;b++)
				System.out.print(" ");
			System.out.print("C");
			System.out.println();
		}
	}
}