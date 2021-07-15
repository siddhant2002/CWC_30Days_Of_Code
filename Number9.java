import java.math.*;
public class Number9 {

	public static void main(String[] args) {
		BigInteger nm=new BigInteger("1");
		for(int i=2;i<=100;i++)
		{
			nm=nm.multiply(BigInteger.valueOf(i));
		}
		System.out.println("The length is "+(nm.toString().length()));
	}
}
