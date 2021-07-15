import java.util.*;
import java.math.*;
public class Number93 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,p;
		System.out.println("Enter the base");
		n=sc.nextInt();
		System.out.println("Enter the power");
		p=sc.nextInt();
		BigInteger nm=new BigInteger(String.valueOf(n)).pow(p);
		System.out.println(nm);
	}
}
