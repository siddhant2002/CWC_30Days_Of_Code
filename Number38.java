import java.util.*;

public class Number38 {
	static ArrayList<Integer> nm=new ArrayList<>();
	static ArrayList<Integer> kk=new ArrayList<>();
	static ArrayList<String> k=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,f=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" numbers");
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        task(a);
        for(i=1;i<nm.size();i++)
        {
        	if(nm.get(i)%n==0)
        	{
        		System.out.println(kk.get(i));
        		System.out.println(k.get(i));
        		f=1;
        		break;
        	}
        }
        if(f==0)
        	System.out.println("No such subsequences found");
	}
	static void task(int a[])
    {
        int s=0,i,j,c=0;
        String p="";
        for (i=0;i<1<<a.length;i++)
        {
        	s=0;
        	c=0;
        	p="";
            for (j=0;j<a.length;j++)
            {
            	if((i&(1<<j))>0)
            	{
            		s=s+a[j];
            		c++;
            		p=p+a[j];
            	}
            }
            nm.add(s);
            kk.add(c);
            k.add(p);
        }
    }
}
