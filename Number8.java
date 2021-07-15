import java.util.*;
public class Number8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		double w,d,wt,s=0;
		System.out.println("Enter the number of boxes");
		n=sc.nextInt();
		System.out.println("Enter the mean weight of box");
		w=sc.nextDouble();
		System.out.println("Enter the standard deviation");
		d=sc.nextDouble();
		System.out.println("Enter the weight which can be handled by the truck");
		wt=sc.nextDouble();
		double a[]=new double[n];
		if(((w+d)*n)<=wt)
			System.out.println("The probability of transfering "+n+" boxes is 100%");
		else
		{
			System.out.println("Enter the weight of "+n+" boxes");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextDouble();
				s=s+a[i];
			}
			for(i=n-1;i>=0;i--)
			{
				if(s<=wt)
					break;
				else
					s=s-a[i];
			}
			System.out.println((i+1)+" boxes can be transfered in the truck and probability is 100%");
			System.out.println("The probability of transfering "+n+" boxes is "+(((double)i/n)*100));
		}
	}
}
