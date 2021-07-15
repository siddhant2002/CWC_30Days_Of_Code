import java.util.*;
public class Number92 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0,s1=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		s=(n*(n+1)*(2*n+1))/6;
		s1=(int)(Math.pow(((n*(n+1))/2),2));
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is "+(s1-s));
	}
}
