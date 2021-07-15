import java.util.*;
public class Number71 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=1,k=0;i<=n;i++,k++)
		{
			for(j=i;j<=n;j++)
				System.out.print(j);
			for(j=1;j<=k;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}
