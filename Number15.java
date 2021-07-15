import java.util.*;
public class Number15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,m;
		System.out.println("Enter the number of rod pieces");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter length of "+n+" rod pieces");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the prices of the pieces");
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Enter the required rod length");
		m=sc.nextInt();
		ArrayList<Integer> nm=new ArrayList<>();
		ArrayList<Integer> kk=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			if(a[i]<=m)
			{
				nm.add(a[i]);
				kk.add(b[i]);
			}
		}
		int c[]=new int[nm.size()+1];
		c[0]=1;
		for(i=0;i<nm.size();i++)
		{
			for(j=nm.get(i);j<=m;j++)
			{
				c[j]=c[j]+c[j-nm.get(i)];
			}
		}
		Arrays.sort(c);
		for(i=0;i<nm.size();i++)
		{
			if(c[c.length-1]==kk.get(i))
			{
				System.out.println(kk.get(i)*(m/nm.get(i)));
				break;
			}
		}
	}
}
