import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,p,q,r,s;
		System.out.println("Enter the diagonal coordinates of both the rectangles");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		p=sc.nextDouble();
		q=sc.nextDouble();
		r=sc.nextDouble();
		s=sc.nextDouble();
		if(a==c||b==d||p==r||q==s||a>=r||p>=c||b>=s||q>=d)
			System.out.println("The two rectangles don't intersect");
		else
			System.out.println("The two rectangles intersect with each other");
	}
}
