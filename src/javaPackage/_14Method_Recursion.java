package javaPackage;

public class _14Method_Recursion 
{
	public static void main(String[] args) 
	{
		int result = sum(5, 10);
		
		System.out.println(result);
	}
	
	public static int sum(int s, int e)
	{
		if(e > s)
		{
			return e + sum(s, e - 1);
		}
		else
		{
			return e;
		}
	}

}
