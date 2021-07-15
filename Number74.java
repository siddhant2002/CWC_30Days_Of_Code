import java.util.*;
public class Number74 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		double s=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		double a[]=new double[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();
			a[i]=1/a[i];
			s=s+a[i];
		}
		System.out.println("The harmonic mean is "+(n/s));
	}
}
