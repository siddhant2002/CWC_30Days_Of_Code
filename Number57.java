import java.util.*;
public class Number57 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.print("Number of 1's in "+n+" is ");
        for(;n!=0;n=n>>>1)
        {
            c+=(n&1);
        }
        System.out.println(c);
	}
}
