import java.util.*;
public class Number90 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		StringBuilder n=new StringBuilder();
		System.out.println("The reverse of the number is "+(n.append(String.valueOf(Math.abs(sc.nextInt()))).reverse()));
	}
}
