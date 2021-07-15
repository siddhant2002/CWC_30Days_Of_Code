import java.util.*;
public class Number59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k,i,j=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the number of rotations you want");
		k=sc.nextInt();
        k=k%a.length;
        int b[]=new int[k];
        for(i=a.length-k;i<a.length;i++)
        {
            b[j++]=a[i];
        }
        for(i=a.length-k-1;i>=0;i--)
        {
            a[i+k]=a[i];
        }
        for(j=0;j<k;j++)
        {
            a[j]=b[j];
        }
        System.out.println("Enter the size of the queries");
        n=sc.nextInt();
        int d[]=new int[n];
        System.out.println("Enter "+n+" queries");
        for(i=0;i<n;i++)
        	d[i]=sc.nextInt();
        for(i=0;i<d.length;i++)
            System.out.print(a[d[i]]+" ");
	}
}
