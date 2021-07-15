import java.math.*;
public class Number96 {

	public static void main(String[] args) {
		BigInteger nm=new BigInteger("1");
		int i;
		for(i=1;i<=1000;i++)
		{
			nm=nm.add(BigInteger.valueOf((long) Math.pow(i,i)));
		}
		System.out.println(String.valueOf(nm).substring(String.valueOf(nm).length()-10));
	}
}
