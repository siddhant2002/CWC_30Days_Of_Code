import java.util.*;
public class Number28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0,i;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			s=s+(int)(Math.pow((i+1),(n-i)));
		}
		System.out.println("The sum is "+s);
	}
}
