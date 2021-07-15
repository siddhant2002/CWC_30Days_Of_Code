import java.util.*;
public class Number17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nm[]= {"Cheese Pizza","Chicken Burst Pizza","Double Cheese Mixed Pizza","Mushroom Grilled Cheese Burst Pizza","Coke (300ml)","Mineral Water"};
		int pr[]= {350,420,440,510,35,40};
		int i,s=0;
		String p;
		boolean k1=true;
		ArrayList<Integer> kk=new ArrayList<>();
		ArrayList<Integer> k=new ArrayList<>();
		System.out.println("Please choose from the below menu");
		for(i=0;i<nm.length;i++)
		{
			System.out.println((i+1)+"."+nm[i]+" - "+pr[i]+" rupees");
		}
		System.out.println("Enter the item number you want to take then enter the word next to add quantity numbers");
		while(k1)
		{
			p=sc.next();
			if(p.equalsIgnoreCase("Next"))
			{
				k1=false;
			}
			else
			{
				kk.add(Integer.parseInt(p));
			}
		}
		System.out.println("Enter the corresponding quantity:");
		for(i=0;i<kk.size();i++)
		{
			k.add(sc.nextInt());
		}
		for(i=0;i<kk.size();i++)
		{
			s=s+(pr[kk.get(i)-1]*k.get(i));
		}
		System.out.println("Thanks for visiting here’");
		System.out.println("Bill Generated…");
		System.out.println("Please pay Rs. "+s+" through any mode of payment.");
	}
}
