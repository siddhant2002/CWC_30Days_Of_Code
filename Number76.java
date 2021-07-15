import java.util.*;
public class Number76 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println(((n*n)+n+2)/2+" pieces can be formed by making "+n+" cuts");
	}
}
