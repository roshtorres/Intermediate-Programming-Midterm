package javaPackage;
import java.lang.Math;

public class _11Methods_Method2 
{
	public static double add (int b1, double a1)
	{
		double sum = 0;
		
		sum = a1 + met(3, 5);
		
		return sum;
	}
	
	static int met(int x, int y)
	{
		return x*y;
	}
	
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 3;
			
		System.out.print(add(a, b));
	}
		
}
