package generate;

public class GenerateUnique 
{
	//list has only unique values
	//list may or may not be sorted
	//generate a number not contained therein
	public int findUniqueInt(int[] nums)
	{
		int temp = nums[0];
		
		for(int i = 1; i < nums.length; i++)
		{
			temp = nums[i] ^ temp;
		}
		
		return temp;
	}
}
