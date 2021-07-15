import java.util.*;
public class Number41 {
	static ArrayList<String> nm=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s,j;
		String s1="";
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			s1=s1+a[i];
		}
		System.out.println("Enter the sum");
		s=sc.nextInt();
		check(s1,"");
		n=0;
		for(i=0;i<nm.size()-1;i++)
		{
			j=0;
			n=Integer.parseInt(nm.get(i));
			while(n!=0)
			{
				j=j+(n%10);
				n/=10;
			}
			if(j==s)
			{
				System.out.println("YES");
				break;
			}
		}
		if(i==nm.size()-1)
			System.out.println("NO");
	}
	static void check(String a , String b)
	{
		if(a.length()==0)
		{
			nm.add(b);
			return;
		}
		check(a.substring(1),b+a.charAt(0));
		check(a.substring(1),b);
	}
}
