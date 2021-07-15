import java.util.*;
public class Number33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s;
		System.out.println("Enter number of sections");
		n=sc.nextInt();
		while(n-->0)
		{
			System.out.println("Enter number of students");
			s=sc.nextInt();
			int a[]=new int[s];
			System.out.println("Enter marks of "+s+" students");
			for(i=0;i<s;i++)
			{
				a[i]=sc.nextInt();
			}
			int b[];
			b=sort(a);
			for(i=0;i<s;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
	static int[] sort(int a[])
	{
		Arrays.sort(a);
		return a;
	}
}
