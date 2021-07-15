import java.util.*;
public class Number72 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> nm=new ArrayList<>();
		ArrayList<Integer> kk=new ArrayList<>();
		int ch,i,j,d;
		System.out.println("Press 1 to start the array else press 0 to eliminate");
		ch=sc.nextInt();
		if(ch==1)
		{
			do
			{
				System.out.println("Enter a value");
				nm.add(sc.nextInt());
				System.out.println("Enter the index postion");
				kk.add(sc.nextInt());
				System.out.println("Press 1 to continue for the next number");
				ch=sc.nextInt();
			}while(ch==1);
			int a[]=new int[nm.size()];
			int b[]=new int[nm.size()];
			for(i=0;i<nm.size();i++)
			{
				a[i]=nm.get(i);
				b[i]=kk.get(i);
			}
			for(i=0;i<nm.size()-1;i++)
			{
				for(j=0;j<nm.size()-1-i;j++)
				{
					if(b[j]>b[j+1])
					{
						d=b[j];
						b[j]=b[j+1];
						b[j+1]=d;
						d=a[j];
						a[j]=a[j+1];
						a[j+1]=d;
					}
				}
			}
			for(i=0;i<nm.size();i++)
			{
				System.out.print(a[i]+"  ");
			}
			for(i=0;i<nm.size();i++)
			{
				System.out.print(b[i]+"  ");
			}
		}
		else
			System.out.println("Empty array");
	}
}
