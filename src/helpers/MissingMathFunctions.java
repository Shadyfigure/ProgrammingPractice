package helpers;

public class MissingMathFunctions 
{
	public static int factorialOf(int num)
	{
		int factorial = 1;
		
		for(int i = 1; i <= num; i++)
		{
			factorial *= i;
		}
		
		return factorial;
	}
}
