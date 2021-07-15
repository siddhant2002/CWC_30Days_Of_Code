import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,x2,x3,x4,y1,y2,y3,y4,a,b,c,d;
		System.out.println("Enter the 4 coordinates of the rectangle");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		x4=sc.nextDouble();
		y4=sc.nextDouble();
		a=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		b=Math.sqrt((Math.pow((x3-x4),2))+(Math.pow((y3-y4),2)));
		c=Math.sqrt((Math.pow((x4-x1),2))+(Math.pow((y4-y1),2)));
		d=Math.sqrt((Math.pow((x3-x2),2))+(Math.pow((y3-y2),2)));
		if(a==b&&c==d)
			System.out.println("Points of rectangle");
		else
			System.out.println("Not the points of rectangle");
	}
}
