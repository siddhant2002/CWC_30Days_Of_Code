import java.util.*;
public class Number19 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k,i,j;
		System.out.println("How many numbers you want to store for the matrix chain multiplication");
		n=sc.nextInt();
		System.out.println("How many sequences you want to check to find the optimised one?");
		k=sc.nextInt();
		ArrayList<Integer> nm=new ArrayList<>();
		for(i=1;i<=k;i++)
		{
			int a[]=new int[n];
			System.out.println("Enter "+n+" numbers");
			for(j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			nm.add(task(a,0,a.length-1));
		}
		k=nm.get(0);
		j=0;
		for(i=1;i<nm.size();i++)
		{
			if(nm.get(i)<k)
			{
				k=nm.get(i);
				j=i;
			}
		}
        System.out.println("All the sequences with their operations are "+nm+" and among them.");
        System.out.println("Best sequence for the ML model that runs in least time will be the sequence no :"+(j+1)+" and the no of operations will be "+k);
	}
	public static int task(int[] a, int i, int j)
    {
        if (j<=i+1) 
        {
            return 0;
        }
        int k,c,min=Integer.MAX_VALUE;
        for (k=i+1;k<=j-1;k++)
        {
            c=task(a,i,k);
            c+=task(a,k,j);
            c+=a[i]*a[k]*a[j];
            if(c<min) 
            {
                min=c;
            }
        }
        return min;
    }
}
