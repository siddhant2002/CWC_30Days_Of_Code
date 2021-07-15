import java.util.*;
public class Number22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,k=0;
		System.out.println("Enter two numbers");		
		for(a=sc.nextInt(),b=sc.nextInt();b!=0;a=a<<1,b=b>>1)
		{
			if((b&1)==1)
				k+=a;
		}
		System.out.println(k);
	}
}
