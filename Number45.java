import java.util.*;
public class Number45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter a number");
		n=sc.nextInt();
		String p,q="";
		p=Integer.toBinaryString(n);
		for(i=0;i<p.length();i++)
		{
			if(p.charAt(i)=='1')
				q=q+p.charAt(i);
			else if(p.charAt(i)=='0')
				q=p.charAt(i)+q;
		}
		System.out.println("The minimise form is "+Integer.parseInt(q,2));
	}
}
