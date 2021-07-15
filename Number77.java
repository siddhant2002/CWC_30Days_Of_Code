import java.util.*;
public class Number77 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s=0,num,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if((Math.abs(a[i]-a[j]))==num)
					s++;
			}
		}
		if(s>0)
			System.out.println(s);
		else
			System.out.println("No such pairs found");
	}
}
