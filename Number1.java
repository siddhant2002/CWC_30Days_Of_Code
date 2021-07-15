import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("The number of not repeating combinations can formed is "+form(n));
	}
	static int form(int n)
	{
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return (n-1)*(form(n-1)+form(n-2));
	}
}
