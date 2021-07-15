import java.util.*;
public class Number53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i==n)
			{
				System.out.print((int)Math.pow(i,2)+",");
				break;
			}
			System.out.print((int)Math.pow(i,2)+",");
			System.out.print((int)Math.pow(i,3)+",");
		}
		System.out.print((int)Math.pow(i,3));
	}
}
