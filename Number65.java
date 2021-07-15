import java.util.*;
public class Number65 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i=0,d;
		System.out.print("Enter the number you want to check: ");
		n=sc.nextInt();
		int a[]=new int[String.valueOf(n).length()];
		while(n!=0)
		{
			a[i++]=n%10;
			n/=10;
		}
		Arrays.sort(a);
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				break;
		}
		if(i==(a.length-1))
			System.out.println("The number is unique.");
		else
			System.out.println("The number is not unique.");
	}
}
