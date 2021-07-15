import java.util.*;

public class Number70 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		ArrayList<Integer> nm=new ArrayList<>();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				nm.add(i+(n/i));
			}
		}
		Collections.sort(nm);
		System.out.println("The smallest sum is "+nm.get(0));
	}
}
