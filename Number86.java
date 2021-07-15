
public class Number86 {

	public static void main(String[] args) {
		int i,n,n1,l,c=0,l1;
        String s;
        long i1;
        for(i=1;i<=1000;i++)
        {
            i1=(long)(Math.pow(i,2));
            if(i==1)
            {
                System.out.print(i+" ");
                c++;
            }
            s=String.valueOf(i);
            l1=s.length();
            s=String.valueOf(i1);
            l=s.length();
            if(l>1)
            {
                n1=Integer.parseInt(s.substring(l-l1));
                n=Integer.parseInt(s.substring(0,(l-l1)));
                if((n+n1)==i)
                {
                   System.out.print(i+" ");
                   c++;
                }
            }
        }
        if(c==0)
        {
            System.out.println("INVALID RANGE");
        }
	}
}
