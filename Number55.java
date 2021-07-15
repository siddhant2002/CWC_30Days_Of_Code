import java.util.Scanner;
public class Number55 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Number55 nm=new Number55();
		Number55 kk=new Number55();
		nm.setData();
		kk.setData();
		nm=nm.add(nm, kk);
		nm.display();
	}
	int real,image;
	Number55()
	{
		real=0;
		image=0;
	}
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part and imaginary part of the number");
		real=sc.nextInt();
		image=sc.nextInt();
	}
	Number55 add(Number55 nm, Number55 kk)
	{
		Number55 k=new Number55();
		k.real=nm.real+kk.real;
		k.image=nm.image+kk.image;
		return k;
	}
	void display()
	{
		System.out.println("The real part of the number is "+real +" and imaginary part of the number is "+image);;
	}
}