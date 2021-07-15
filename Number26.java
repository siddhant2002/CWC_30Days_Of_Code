import java.util.*;
public class Number26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,f=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=1;i<=(int)(Math.sqrt(n));i++)
		{
			if(i*(i+1)==n)
			{
				f=1;
				break;
			}
		}
		if(f==1)
			System.out.println("Pronic number");
		else
			System.out.println("Not pronic number");
	}
}
