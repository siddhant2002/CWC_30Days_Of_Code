import java.util.*;
public class Number7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.println("Enter the area of the square");
		a=sc.nextDouble();
		System.out.println("The area of the circle is "+(Math.PI*(Math.pow((Math.sqrt(a))/2,2))));
	}
}
