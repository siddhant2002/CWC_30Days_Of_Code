import java.util.*;
public class Number61 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double n;
		System.out.println("Enter a number");
		n=sc.nextDouble();
		System.out.println(squareRoot(n,0.00001));
	}
	static double squareRoot(double n, double l)
    {
        double x=n;
        double root;
        int count=0;
        while (true)
        {
            count++;
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<l)
                break;
            x=root;
        }
        return root;
    }
}
