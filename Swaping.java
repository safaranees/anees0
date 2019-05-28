import java.io.*;
import java.util.*;
public class Swaping
{
	public static void main(String args[])
	{
		Scanner  s=new  Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println(a+" "+b);
	}
}
