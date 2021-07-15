import java.util.*;
public class Number30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> nm=new ArrayList<>();
		ArrayList<Integer> kk=new ArrayList<>();
		ArrayList<Integer> nm1=new ArrayList<>();
		ArrayList<Integer> kk1=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
				nm1.add(a[i]);
			else
				kk1.add(a[i]);
		}
		for(i=0;i<nm1.size();i++)
		{
			if(a[i]<0)
				kk.add(a[i]);
		}
		for(j=n-kk1.size();j<n;j++)
		{
			if(a[j]>0)
				nm.add(a[j]);
		}
		for(i=0;i<nm1.size()-nm.size();i++)
		{
			a[i]=nm1.get(i);
		}
		for(j=0;j<nm.size();j++)
		{
			a[i++]=nm.get(j);
		}
		for(j=0;j<kk.size();j++)
		{
			a[i++]=kk.get(j);
		}
		for(j=kk1.size()-kk.size();i<n;i++,j++)
		{
			a[i]=kk1.get(j);
		}
		System.out.println("The updated array is");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
