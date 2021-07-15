import java.util.*;

public class Number13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j=0;
		System.out.println("Enter the total no. of questions asked: ");
		n=sc.nextInt();
		String a[]=new String[n];
		String b[]=new String[n];
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter asker’s and coordinator’s name for "+i+(alpha(i))+" one");
			a[j]=sc.next();
			b[j++]=sc.next();
		}
		System.out.println("Asker "+"\t\t\t\t"+"Query Solved by");
		for(i=0;i<j;i++)
		{
			System.out.println(a[i]+"\t\t\t\t    "+b[i]);
		}
	}
	static String alpha(int i)
	{
		if(i%100==11||i%100==12||i%100==13)
			return "th";
		else
		{
			if(i%10==1)
				return "st";
			else if(i%10==2)
				return "nd";
			else if(i%10==3)
				return "rd";
			else
				return "th";
		}
	}
}
