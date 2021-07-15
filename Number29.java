import java.util.*;
public class Number29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		double s=0,p=0.5,t=0;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		System.out.println(0.5/10);
		for(i=1;i<=n;i++,p/=10)
		{
			s=s+p;
			t+=s;
		}
		System.out.println("The sum is "+t);
	}
}
