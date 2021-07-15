import java.util.*;
public class Number97 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,5,10,20,50,100,200};
		System.out.println("Enter the sum total");
		int i,s,j;
		s=sc.nextInt();
		int b[]=new int[s+1];
		b[0]=1;
		for(i=0;i<8;i++)
		{
			for(j=a[i];j<=s;j++)
			{
				b[j]=b[j]+b[j-a[i]];
			}
		}
		System.out.println("In "+b[200]+" ways 200p can be made.");
	}
}
