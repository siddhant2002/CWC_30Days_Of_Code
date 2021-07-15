import java.util.*;
public class Number85 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,b,k;
		System.out.println("Enter number of lines");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(b=1;b<=2*(n-i);b++)
				System.out.print(" ");
			for(k=1;k<=i;k++)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}
