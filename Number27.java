import java.util.*;
public class Number27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j=1;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
				break;
		}
		for(;i<n;i++,j++)
		{
			if(j!=a[i])
				break;
		}
		System.out.println("The minimum positive number is "+j);
	}
}
