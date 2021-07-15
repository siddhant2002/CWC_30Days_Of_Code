import java.util.*;
public class Number58 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the number in roman format");
		s=sc.nextLine();
		int a[]=new int[s.length()];
        int i,s1=0;
        char c;
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='I')
                a[i]=1;
            else if(c=='V')
                a[i]=5;
            else if(c=='X')
                a[i]=10;
            else if(c=='L')
                a[i]=50;
            else if(c=='C')
                a[i]=100;
            else if(c=='D')
                a[i]=500;
            else if(c=='M')
                a[i]=1000;
        }
        for(i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
                s1=s1-a[i];
            else
                s1=s1+a[i];
        }
        s1=s1+a[a.length-1];
        System.out.println(s1);
	}
}
