import java.util.*;
public class Number25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("Enter a bit which is to be toggled");
		k=sc.nextInt();
		System.out.println(toggle(n,k));
	}
	static int toggle(int n , int k)
	{
		return (n^(1<<(k-1)));
	}
}
