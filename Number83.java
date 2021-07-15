import java.util.*;
public class Number83 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,m;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n!=0)
		{
			ArrayList<Integer> nm=new ArrayList<>();
			nm.add(0,a[n-1]);
			m=a[n-1];
			for(i=n-2;i>=0;i--)
			{
				if(a[i]>m)
				{
					nm.add(0,a[i]);
					m=a[i];
				}
			}
			for(i=0;i<nm.size();i++)
			{
				System.out.print(nm.get(i)+" ");
			}
		}
	}
}
