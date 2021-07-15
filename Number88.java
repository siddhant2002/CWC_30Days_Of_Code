import java.util.*;
public class Number88 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("Enter the lower range and upper range");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("The number between "+n+" and "+m+" is "+((int)(Math.random()*(m-n)+1)+n));
	}
}
