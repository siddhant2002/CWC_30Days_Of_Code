import java.util.*;
public class Number34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(i=0;i<n;i++)
		{
			s=s+(a[i]*b[i]);
		}
		System.out.println("The maximised value is "+s);
	}
}
