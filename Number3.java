import java.util.*;
import java.math.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a,b,i,n;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		n=a+1;
		for(i=a;i<=b;n++)
		{
			if(n%i!=0&&math.abs(((n/i)-Math.PI))<0)
			{
				System.out.println(n/i);
				break;
			}
			if(n>b*3)
				i++;
		}
	}
}
