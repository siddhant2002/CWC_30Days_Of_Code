import java.util.*;
public class Number35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println(fibo(n));
	}
	static int fibo(int n)
	{
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
}