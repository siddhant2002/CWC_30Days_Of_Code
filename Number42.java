import java.util.*;
public class Number42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int i,b,k=n,k1=n,a,b1,k2=n-1,k3=n+1;
		for(i=1;i<=n;i++)
		{
			for(b=1;b<=n-i;b++)
				System.out.print(" ");
			if(i%2==1)
			{
				for(a=k;a<=k1;a+=2)
					System.out.print(a+" ");
				System.out.println();
				k-=2;
				k1+=2;
			}
			else
			{
				for(b1=k2;b1<=k3;b1+=2)
					System.out.print(b1+" ");
				System.out.println();
				k2-=2;
				k3+=2;
			}
		}
	}
}
