import java.util.*;
public class Number18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k,i,nu,d;
		System.out.println("Enter the value of n and k");
		n=sc.nextInt();
		k=sc.nextInt();
		for(i=(int)Math.pow(10,n-1);i<(int)Math.pow(10,n);i++)
		{
			nu=i;
			ArrayList<Integer> nm=new ArrayList<>();
			while(nu!=0)
			{
				d=nu%10;
				nm.add(d);
				nu/=10;
			}
			for(d=0;d<nm.size()-1;d++)
			{
				if(Math.abs(nm.get(d)-nm.get(d+1))<=k)
					break;
			}
			if(d==nm.size()-1)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
