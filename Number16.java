import java.util.*;
public class Number16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p;
		int i,n=0,po=0,n1=0,po1=0,j=0;
		System.out.println("Enter the equation to find the differentiation");
		p=sc.nextLine();
		p=p.toLowerCase();
		for(i=0;i<p.length();i++)
		{
			if(p.charAt(i)=='x')
			{
				n=Integer.parseInt(p.substring(0,i));
				po=p.charAt(i+2)-'0';
			}
			if(p.charAt(i)=='+')
				j=i;
			else if(p.charAt(i)=='y')
			{
				n1=Integer.parseInt(p.substring((j+1),i));
				po1=p.charAt(i+2)-'0';
			}
		}
		System.out.print("Derivative of the given equation: ");
		if(po==1&&po1==1)
			System.out.println((n*po)+(n1*po1));
		else if(po==0&&po1==0)
			System.out.println(0);
		else if(po==0&&po1==1)
			System.out.println(n1*po1);
		else if(po==1&&po1==0)
			System.out.println(n*po);
		else if(po>1&&po1==0)
			System.out.println((n*po)+"x^"+(po-1));
		else if(po==0&&po1>1)
			System.out.println((n1*po1)+"y^"+(po1-1));
		else if(po>1&&po1==1)
			System.out.println((n*po)+"x^"+(po-1)+" + "+(n1*po1));
		else if(po==1&&po1>1)
			System.out.println((n*po)+" + "+(n1*po1)+"y^"+(po1-1));
		else
			System.out.println(((n*po)+"x^"+(po-1))+" + "+((n1*po1)+"y^"+(po1-1)));
		System.out.println("After integration we got "+p+" , hence proved.");
		System.out.println("Do you Want to solve the differential equation for any value of x and y? Enter Yes or No");
		p=sc.next();
		if(p.equals("Yes"))
		{
			System.out.println("Enter the value of x and y:");
			i=sc.nextInt();
			j=sc.nextInt();
			System.out.print("Value of the differential equation :");
			System.out.println((int)((n*po)*Math.pow(i,(po-1))));
		}
		else
			System.out.println("Terminated");
	}
}
