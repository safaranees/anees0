import java.io.*;
import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner  s=new Scanner(System.in);
		int a,b,c=1,i,n;
		a=1;
		b=0;
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
