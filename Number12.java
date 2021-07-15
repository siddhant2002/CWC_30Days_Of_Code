import java.util.*;
public class Number12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		String p,q="",c="1";
		System.out.println("Enter a number");
		n=sc.nextInt();
		p=Integer.toBinaryString(n);
		for(i=0;i<p.length();i++)
		{
			if(p.charAt(i)=='1')
				q=q+"0";
			else
				q=q+"1";
		}
		q="1"+q;
		p="";
		for(i=q.length()-1;i>=0;i--)
		{
			if(q.charAt(i)=='1'&&c=="1")
			{
				p="0"+p;
				c="1";
				
			}
			else if(q.charAt(i)=='1'&&c=="0")
			{
				p="1"+p;
				c="0";
				
			}
			else if(q.charAt(i)=='0'&&c=="1")
			{
				p="0"+p;
				c="0";
				
			}
			else
			{
				p="0"+p;
				c="0";
			}	
		}
		if(c=="1")
			p="1"+p;
		System.out.println(p);
	}
}