package searches;

public class FindTheTwos 
{	
	public FindTheTwos()
	{
	}
	
	private int checkTwos(int num)
	{
		int temp = num;
		int count = 0;
		
		while(temp > 0)
		{
			if((temp % 10) == 2)
			{
				count++;
			}
			
			temp = temp / 10;
		}
		
		return count;
	}
	
	//check for number of 2's between 0 and n
	//example: for n = 20, result = 3 (2,12,20)
	public int checkRangeForTwos(int num)
	{
		if(num < 2)
		{
			return 0;
		}
		
		int count = 0;
		
		for(int i = 2; i <= num; i++)
		{
			count += checkTwos(i);
		}
			
		return count;
	}
}
