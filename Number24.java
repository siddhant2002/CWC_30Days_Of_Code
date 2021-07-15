import java.util.*;
public class Number24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> nm=new ArrayList<>();
		ArrayList<Integer> kk=new ArrayList<>();
		int i,j,k;
		do
		{
			System.out.println("Enter a number");
			i=sc.nextInt();
			nm.add(i);
			System.out.println("Press 1 for the next number");
			k=sc.nextInt();
		}while(k==1);
		j=0;
		k=nm.size()-1;
		for(i=0;i<nm.size();i++)
		{
			if(nm.get(i)%2==0)
			{
				kk.add(nm.get(i));
			}
		}
		for(i=0;i<nm.size();i++)
		{
			if(nm.get(i)%2==1)
			{
				kk.add(nm.get(i));
			}
		}
		for(i=0;i<kk.size();i++)
			System.out.print(kk.get(i)+" ");
	}
}
