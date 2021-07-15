import java.util.*;
public class Number67 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,i,j,k;
		System.out.println("Enter the sizes of 3 array");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int n[]=new int[a];
		int n1[]=new int[b];
		int n2[]=new int[c];
		System.out.println("Enter "+a+" numbers");
		for(i=0;i<a;i++)
		{
			n[i]=sc.nextInt();
		}
		System.out.println("Enter "+b+" numbers");
		for(i=0;i<b;i++)
		{
			n1[i]=sc.nextInt();
		}
		System.out.println("Enter "+c+" numbers");
		for(i=0;i<c;i++)
		{
			n2[i]=sc.nextInt();
		}
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				for(k=0;k<c;k++)
				{
					if(n[i]==n1[j]&&n1[j]==n2[k])
						System.out.print(n2[k]+" ");
				}
			}
		}
	}
}
