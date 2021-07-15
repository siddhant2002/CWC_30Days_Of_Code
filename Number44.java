import java.util.*;
public class Number44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		String p,q;
		System.out.println("Enter a number");
		n=sc.nextInt();
		StringBuilder nm=new StringBuilder();
	    nm=nm.append(Integer.toBinaryString(n));
	    p=nm.toString();
		q=nm.reverse().toString();
		if(p.equals(q))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
}
