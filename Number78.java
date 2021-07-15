import java.util.*;

public class Number78 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,p,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value of p");
		p=sc.nextInt();
		if(p>n-1||p<0)
			System.out.println("Invalid choice");
		else
		{
			j=a[p-1];
			a[p-1]=a[a.length-p];
			a[a.length-p]=j;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
