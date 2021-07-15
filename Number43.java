import java.util.*;
public class Number43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("The binary conversion of the number is "+(Integer.toBinaryString(n)));
		System.out.println("The binary conversion of the number is "+(Integer.toOctalString(n)));
		System.out.println("The binary conversion of the number is "+(Integer.toHexString(n)));
	}
}
