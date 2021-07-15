import java.util.*;
public class Number11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,x2,y1,y2,n;
		int i;
		System.out.print("Enter the total no. of paths you want to compare for : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter the constraints for "+(i)+""+(alpha(i))+" path: ");
			System.out.println("Enter X and Y coordinates of Initial position: ");
			x1=sc.nextDouble();
			y1=sc.nextDouble();
			System.out.println("Enter X and Y coordinates of Final position: ");
			x2=sc.nextDouble();
			y2=sc.nextDouble();
			input(x1,y1,x2,y2);
		}
		if(i==n+1)
			display();
		
	}
	static ArrayList<Double> nm=new ArrayList<>();
	static String alpha(int i)
	{
		if(i%100==11||i%100==12||i%100==13)
			return "th";
		else
		{
			if(i%10==1)
				return "st";
			else if(i%10==2)
				return "nd";
			else if(i%10==3)
				return "rd";
			else
				return "th";
		}
	}
	static void input(double x1, double y1, double x2, double y2)
	{
		nm.add(Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))));
	}
	static void display()
	{
		int i,k=0;
		double j=nm.get(0);
		for(i=0;i<nm.size();i++)
		{
			System.out.println(nm.get(i)+"  Units Distance will be covered in path "+(i+1)+".");
			if(j>nm.get(i))
			{
				j=nm.get(i);
				k=i+1;
			}
		}
		System.out.println("You should go with path "+k);
		
	}
}
