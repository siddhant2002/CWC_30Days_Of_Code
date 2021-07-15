import java.util.*;
public class Number64 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		if(n<=0||String.valueOf(n).length()<4||String.valueOf(n).length()>4)
			System.out.println(n+" is not a valid car number");
		else
		{
			int d,s=0;
			while(n!=0)
			{
				d=n%10;
				s=s+d;
				n/=10;
			}
			if(s%3==0||s%5==0||s%7==0)
				System.out.println("Lucky number");
			else
				System.out.println("Sorry it's not my lucky number");
		}
	}
}
