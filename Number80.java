import java.util.*;
public class Number80 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,c=0,c1=0,c2=0,c3=0,d;
		String p,q;
		System.out.println("Enter two numbers");
		n=sc.nextInt();
		m=sc.nextInt();
		p=Integer.toBinaryString(n);
		q=Integer.toBinaryString(m);
		if(p.length()!=q.length())
		{
			if(p.length()>q.length())
	        {
	            for(int i=1;i<=p.length()-q.length();i++)
	            {
	                q="0"+q;
	            }
	            for(int i=0;i<q.length();i++)
				{
					if(p.charAt(i)=='1')
						c++;
					else
						c1++;
					if(q.charAt(i)=='1')
						c2++;
					else
						c3++;
				}
				if(c==c2&&c1==c3)
					System.out.println("True");
				else
					System.out.println("False");
	        }
	        else if(p.length()<q.length())
	        {
	            for(int i=1;i<=q.length()-p.length();i++)
	            {
	                p="0"+p;
	            }
	            for(int i=0;i<p.length();i++)
	    		{
	    			if(p.charAt(i)=='1')
	    				c++;
	    			else
	    				c1++;
	    			if(q.charAt(i)=='1')
	    				c2++;
	    			else
	    				c3++;
	    		}
	    		if(c==c2&&c1==c3)
	    			System.out.println("True");
	    		else
	    			System.out.println("False");
	        }
		}
		else
		{
			for(int i=0;i<q.length();i++)
			{
				if(p.charAt(i)=='1')
					c++;
				else
					c1++;
				if(q.charAt(i)=='1')
					c2++;
				else
					c3++;
			}
			if(c==c2&&c1==c3)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}
