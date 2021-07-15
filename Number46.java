import java.util.*;
public class Number46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d;
		System.out.println("Enter 3 points");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=Math.sqrt(Math.pow(b,2)-(4*a*c));
		if(d>0)
		{
			double p,q;
			p=((-1*b)+d)/(2*a);
			q=((-1*b)-d)/(2*a);
			System.out.println("The roots of the equation are "+p+" "+q);
		}
		else if(d==0)
		{
			double p;
			p=(-1*b)/(2*a);
			System.out.println(p);
		}
		else
		{
			double p,q;
			p=(-1*b)/(2*a);
			q=Math.sqrt(Math.abs(b*b-4*a*c))/10;  
			System.out.println(p+" + "+ q+"i" + "\n"+p+ " - " +q+"i");  
		}
	}
}
