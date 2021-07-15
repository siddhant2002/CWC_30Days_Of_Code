import java.util.*;
public class Number63 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d,s=0;
		System.out.println("Enter your distance in meters");
		d=sc.nextDouble();
		if(d<=250)
			System.out.println("P40.00");
		else
			System.out.println("p"+(40.00+((d-250)/200)*2.50)+"0");
	}
}
