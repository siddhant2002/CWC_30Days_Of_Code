import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("The numbers before swapping is "+x+" and "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("The numbers after swapping is "+x+" and "+y);
	}
}
