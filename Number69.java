import java.util.*;
public class Number69 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=2;i<=n;i+=2)
			if(n%i==0&&i%2==0)
				s=s+i;
		System.out.println("The sum of the even factors is "+s);
	}
}
