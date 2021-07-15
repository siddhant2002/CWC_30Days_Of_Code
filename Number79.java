import java.util.*;
public class Number79 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,m=1,j;
		System.out.println("Enter number of lines ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(m++ +" ");
			}
			System.out.println();
		}
	}
}
